object Tuple {
  def main(args:Array[String]): Unit = {

//    val t1= Tuple1("himanshi")
//    println(t1.getClass)
//
//    val t2= ("scala", 1)
//    println(t2.getClass)
//
//    val num=(1, 2,3, 4, 5, 6, 7,8, 9, 10,11,12,13, 14,1, 2,3, 4, 5, 6, 7,8, 9, 10)
//    print(num)
//
    val t3=("Divya", 25, 50000.00, true)
//    println(t3._1)
//    println(t3._2)
//    println(t3._3)
//    println(t3._4)
//    println(t3.productElement(1))
//    println(t3.productElement(2))

   val t5=((1,2,3),(4,5,6))
    println(t5._1._2)


  val t = ("Divya", 25, 50000.00, true)
//    println(a)
//    println(b)
//    println(c)
//    println(d)

  //  val (a, b, c,d)= t

////
//    val t4=("Divya", 25, 50000.00, true)
//     print(t4.productArity)
//
//      t4.productIterator.foreach(println)
//
//    for(ele<- t4.productIterator){
//      println(ele)
//    }
//
//    for(i<- 0 until t4.productArity){
//      println(t4.productElement(i))
//    }

    val tuple2=("riya", 25)
    println(tuple2.swap)
    val tuple3=(1, "scala", 1.5, true)
    val tuple4=(1, "scala", 1.5, 40)

    println(tuple3==tuple4)
    println(tuple2.equals(tuple4))
    println(tuple3.canEqual(tuple4))

    println(tuple3.productIterator.toList)
    println(tuple3.productIterator.toSet)
    println(tuple3.productIterator.toArray.mkString(","))

    println(tuple3.productIterator.toList ++ tuple4.productIterator.toList)

   def getDetails(): (Int, String, Double, Boolean)= {
     (1, "scala", 1.5, true)
   }

   val result=getDetails()

    println(result)
    println(result._1)
    if(result._1=="Divya"){
      println("matched found")
    }
    else  if(result._1=="Divya"){

    }
    else{

    }

  }

}
