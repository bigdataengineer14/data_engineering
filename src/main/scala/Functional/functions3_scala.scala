package Functional

object functions3_scala {

def main(args:Array[String]): Unit = {

  def countDown(num:Int): Unit = {
    if (num==0) println("Done")
    else{
      println(num)
      countDown(num-1)
    }
  }
  countDown(3)
}

  def factorial(number: Int): Int = {
    if (number == 0) {
      1
    } else {
      number * factorial(number - 1)
    }
  }
  println(factorial(5))

// Fibonacci numbers : 0, 1, 2, 3, 5, 8, 13, 21........sum of previous two numbers=third number
def fibonacciSeries(num: Int): Int = {
  if (num == 0) 0
  else if (num == 1) 1
  else fibonacciSeries(num - 1) + fibonacciSeries(num - 2)
}
  for (i <- 0 until 9) {
    print(fibonacciSeries(i) + " ")
  }

  try {
    val result = 10 / 0
    println(result)
  }
  catch {
    case e: ArithmeticException =>
      println("Arithmetic Exception occurred: " + e.getMessage)
  }


  try {
    println(5 /5)
  }
  catch {
    case e: Exception =>
      println("Error in execution: " + e.getMessage)
  }
  finally {
    println("This will always run")
  }

  import java.io.{FileWriter, PrintWriter}
  import scala.io.Source

  val source=Source.fromFile("C:\\Users\\bigda\\IdeaProjects\\Scala Spark Project\\src\\main\\scala\\input.txt")
  val content=source.getLines().mkString("\n")
  println(content)
  source.close()

  val writer=new PrintWriter("C:\\Users\\bigda\\IdeaProjects\\Scala Spark Project\\src\\main\\scala\\output.txt")
  writer.write("Big Data Engineering is fun")
  writer.close()

  val writer1=new FileWriter("C:\\Users\\bigda\\IdeaProjects\\Scala Spark Project\\src\\main\\scala\\output.txt", true)
  writer1.write("\nNew Line added")
  writer1.close()

}
