object Lists {

  def main(args: Array[String]): Unit = {
//   creating list in scala
    val lst= List(1,2,3, 10, 4, 5, 6)
    println(lst)

    // List is immutable in nature
    println(System.identityHashCode(lst))
    val lst1= 0::lst
    println(lst1)
    println(System.identityHashCode(lst1))

    // list creation using fill
    val filledList= List.fill(3)("scala")
    println(filledList)

  //   accessing element in List
    println(lst.head)
    println(lst.tail)
    println(lst.last)
    println(lst(3))

val list1=List(10,25,30,45,67,89)
val list2=18::list1
println(list2)
println(100 +: list2)  //prepend
println(list2 :+ 200)

   val list3=List(50,55,65)
   val list4=list2 ++ list3
   println(list4)

   val list5=list4.drop(2)
   println(list5)
//   println(list5.dropRight(2))
//   println(list5.dropWhile(x=>x==50))  // parameter => (expression) (_==50)

   val list6=list5.filter(x=>x>45)
   println(list6)



  val list8=list6.zipWithIndex.filter {case ( _, index ) => index >2 }
   println(list8)

   val distinctList=list6.distinct
      println(distinctList)

 val list7=List(67, 89, 56, 67, 70, 75, 67)
    println(list7.map(x=>x*2))
    println(list7.filter(x=>x%2==0).map(x=>x*2))

   val names=List("aa","bb","cccc")
   println(names.filter(name=>name.length>2).map(x=>x.toUpperCase()))

    val words=List("Big", "Data")
    println(words.map(x=>x.toList))
    println(words.map(x=>x.toList).flatten)
    println(words.flatMap(x=>x))

val customers=List(List("aaa", "pen"),List("bbb", "notebook"))
    println(customers.map(x=>x).flatten)
    println(customers.flatMap(x=>x))

val name=List("aa", "bb", "ccc", "DDDD")
val num=List(1, 2, 3, 4, 5, 10, 45, 62, 62)

   println(name.union(num))
    println(name.zip(num))
 println(name.zipWithIndex)

    println(num.sum)
    println(num.max)
    println(num.min)
    println(num.size)

    val num1=List(1, 2, 3, 4, 5, 10, 45, 62, 62)
     println(num1.reduce((a,b)=>a+b))  //reduce(_-_)
   println(num1.reduce((x,y)=> if (x%2==0) x+y else 0))

    println(num1.fold(0)((a,b)=>a+b))
    // println(List.empty[Int].reduce(_+_))
    println(List.empty[Int].fold(0)(_+_))

    val num2=List(1, 2, 3, 4, 5, 10, 45, 62, 62)

    println(num2.groupBy(_%2)) //x=>x%2

    val name2=List("aa", "bbbbbb", "ccc", "dddd", "aaaa", "aaa")
//    val groupedName=name2.groupBy(_.startsWith("a"))
//    println(groupedName)
      println(name2.sorted)
val num4=List(1,5,3,100,42,7,5)
    println(num4.sorted)
    println(num4.sortWith(_>_))


}

}
