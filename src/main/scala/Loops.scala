object Loops {
  import scala.collection.mutable.ArrayBuffer

  def main(args:Array[String]): Unit = {
    var sum=0

    for(i <- 1 to 5){
     sum=sum+i
    }
   println("sum of numbers is : " , sum)


    val friends=Array("AAA", "BBB", "CCC")

    for(friend <- friends){
      println(s"Sending message to ${friend.toLowerCase()} ")

    }

    for (i <- 10 to 1 by -2){
      println(i)
    }

    val numbers = Array(10, 20, 30, 40)
    numbers.foreach(println)

    var count=1
    while (count < 5) {
      println("pre increment", count)
      count=count+1
      println("after increment", count)
    }

    var count1 = 1
    do {
      println(count)
      count += 1
      println("post increment ", count)
    } while (count <= 5)

    var sum1=0

    for(i<- 2 to 11 by 2){
      sum1 +=i
    }
    println(sum1)

    var sum2=0
    for(i<- 1 to 11 ){
      if(i%2==0){
        sum2+=i
      }
    }
    println(sum2)


    var sum3=0
    for(i<- 1 to 11 if i%2==0){
      sum3=i
    }
    println(sum3)

    for(i<- 1 to 3){
      for(j<- 1 to 2){
        println(s"i= $i, j=$j")
      }
    }
  }

}
