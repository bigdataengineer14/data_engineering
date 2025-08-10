package Functional

object Arrays {

    def main(args: Array[String]): Unit = {
// Create Static array
//     val arr= Array(1,2,3)
//      println(arr.mkString(","))
//
//      val arr1=new Array[Int](3)
//      arr1(0)=10
//      arr1(1)=20
//      arr1(2)=30
//      println(arr1.mkString(" , "))
//      println(System.identityHashCode(arr1))
//      arr1(3)=40
//      arr1(0)=100
//      println(arr1.mkString(","))
//      println(System.identityHashCode(arr1))
//
////Create Dynamic Array
//      val arr2=new ArrayBuffer[Int]()
//      arr2 += 10
//      arr2+=20
//      arr2+=30
//      arr2+=40
//
//      println(arr2.mkString(","))
//
//      for(i<- arr1){
//        println(arr1)
//      }
//
//      println(arr1.length)
//      println(arr1.sum)
//      println(arr1.max)
//      println(arr1.min)
//      println(arr1.contains(30))
//      println(arr1.sorted.mkString(","))
//
//// find sum of element
//      val arr3=Array(1,2,3)
//      var sum=0
//      for(i<- arr3){
//        sum+=i
//      }
//      println(sum)
//
// //find max element of an array
//      var max=arr3(0)
//      for(value<- arr3){
//        if(value>max){
//          max=value
//        }
//      }
//      println(max)
//
//// find existence of an element in an array
      val marks=Array(10,20,30,50,55)
      val target=57
      var found=false
      for(mark <- marks){
        if(mark==target){
          found=true
        }
      }
      println(if (found) "found" else "not found")
      val arr1: Array[Any]=Array(10,20,30,50,55, "scala")
      println(arr1.toList.tail)

  }

}
