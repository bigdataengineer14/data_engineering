import sys
from awsglue.transforms import *
from awsglue.utils import getResolvedOptions
from pyspark.context import SparkContext
from awsglue.context import GlueContext
from awsglue.job import Job
from pyspark.sql.functions import col, round

## @params: [JOB_NAME]
args = getResolvedOptions(sys.argv, ['JOB_NAME'])

sc = SparkContext()
glueContext = GlueContext(sc)
spark = glueContext.spark_session
job = Job(glueContext)
job.init(args['JOB_NAME'], args)

df=spark.read.format("csv").option("header", "True").option("path", "s3://october2456/details.csv").load()
df_clean=df.filter((col("id").isNotNull()) & (col("salary") >0))
df_transformed=df_clean.withColumn("revised_salary", round(col("salary") * 1.10, 2))
df_transformed.write.format("csv").option("header", "True").option("path", "s3://october2456/output").mode("overwrite").save()

job.commit()