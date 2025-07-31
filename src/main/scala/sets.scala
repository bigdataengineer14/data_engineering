import scala.collection.mutable
object sets {
  def main(args:Array[String]): Unit = {
//
//    var s1=Set(10,20,30,40,50)
//  //  println(System.identityHashCode(s1))
//    s1+=100
// //   println(System.identityHashCode(s1))  // +, -, ++, --, &, |, +=, -=
//  //  s1=s1+100
//    println(s1)
//  //  s1=s1-20
//   // println(s1)
//    val s3=Set(5, 30)
//    println(s1++s3)
//   println(s1--s3)
//    val s4=Set(10,20)
//    println(s1 & s3)                // & - common values
//    println(s1 | s3)               // first set + uncommon values
//    println(s1.head)
//    println(s1.tail)
//    println(s1.last)
//    println(s1.union(s3))
//    println(s1.zip(s3))
//    println(s1.sum)
//    println(s1.max)
//    println(s1.min)
//    println(s1.toList)


//    val s2=mutable.Set(1,2,3,4,5,5, 10, 20)
//    //println(System.identityHashCode(s2))
//    s2+=20
//   // println(System.identityHashCode(s2))
//    s2-=4
//    println(s2)
//  //  println(s2++s3)
//    val s5=mutable.Set(5, 16)
//    println(s2++s5)
//    println(s2--s5)

    val numbers=Set(10,20,30,40,50, 60)

    for(num<-numbers){
      print(s"${num} ")
    }
    println()

    val numbers1=Set(10,20,30,40,50, 60)
    val newNum=numbers1.toList

    for(i<-0 until newNum.length){
      print(s"${newNum(i)} ")
    }
    println()

  var  i=0

    while(i < newNum.length){
      print(s"${newNum(i)} ")
      i+=1
    }

    val prices=Set(100, 120, 69, 125, 60, 190)

    println(prices.filter(x=>x>100))
    println(prices.map(x=> x*0.9))
    println(prices.reduce((x,y)=>x+y))
    println(prices.filter(x=>x>100).map(x=>x*0.9).reduce((x,y)=>x+y))

  }

}
