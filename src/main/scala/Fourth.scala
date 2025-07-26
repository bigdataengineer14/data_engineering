import scala.collection.mutable.ArrayBuffer
object Fourth {
  def main(args: Array[String]): Unit = {
//    val x=10
//    val result =if (x%2==0) "even" else "odd"
//    println("x is divisible by 2" ,result)
//val weather="sunny"
// val intensity= "heavy"
//
// if(weather=="rainy") {
//      println("Take an umbrella")
//      if(intensity=="heavy"){
//        println("Also wear raincoat")
//      }
//      else if(intensity=="light"){
//       println("take small umbrella")
//      }
//      else{
//        println("Check weather first")
//      }
//    }
// else if (weather=="sunny"){
//      println("Enjoy the sunny weather")
//    }
//    else {
//      println("Do nothing take rest")
//    }

//    val weather="sunny"
//    val intensity="heavy"
//
//    weather match {
//      case "rainy" => println("Take an umbrella")
//        intensity match {
//          case "heavy" => println("")
//          case "light"  => println("")
//        }
//      case "sunny" => println("Enjoy sunny weather")
//      case _        => println("Do nothing take rest")
//    }

//val str=Array[Boolean]()
//    println(str.mkString(","))

    var darr=ArrayBuffer[Int]()
    darr+=10
    darr+=20
    darr+=30
    darr+=40
    darr++=Seq(30,40,50)
    println(darr.mkString(","))





  }

}
