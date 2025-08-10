package Functional

object scala_map {

  def main(args:Array[String]): Unit = {

    val map1=Map(1->"aaa", 2->"bbb", 3->"ccc")


    val unique_keys= Map(1->"aaa", 2->"bbb", 3->"ccc", 1->"ddd", 4->"eee", 5->"fff")
    println(unique_keys)

    val duplicate_values= Map(1->"aaa", 2->"bbb", 3->"ccc", 4->"aaa", 5->"fff")
    println(duplicate_values)

    val immutable_map=map1+(4->"ggggg") // +, -, +=, -=
    println(map1)
    println(immutable_map)

    import scala.collection.mutable

    val mutable_map=mutable.Map(1->"riya", 2->"diya")
    println(System.identityHashCode(mutable_map))
    mutable_map+=(3->"siya")
    println(System.identityHashCode(mutable_map))

    val mixed_map:Map[Int, Any]=Map(1->"himanshu", 2->true, 3->25)
    println(mixed_map)

    val map2= mutable.Map(1->"aaa", 2->"bbb", 3->"ccc", 1->"ddd", 4->"eee", 5->"fff")
    //println(map2(7))
    println(map2.get(7))
    println(map2.getOrElse(7, "Not Found"))
    println(map2.contains(1))
    println(!(map2.contains(4)))
    val map3=map2-(3)
    println(map3)
    map2(1)="AAAA"
    println(map2)
    println(map2.keys.toList)
    println(map2.values.toSet)
    println(map2.toArray.mkString(","))
    println(map2.values.exists(x=>x=="ccc"))

    val map4= mutable.Map(1->"aaa", 2->"bbb", 3->"ccc", 1->"ddd", 4->"eee", 5->"AAA", 6->"aaaa")

    for((k, v)<-map4){
      print(s"{$k,$v} ")
    }
   println()
    for(key<- map4.keys){
      print(s"{$key} ")
    }
println()
    for(value<- map4.values){
      print(s"{$value} ")
    }
println(map4.toList)
  val entries=map4.toList
    for(i<- 0 until entries.length){
      println(entries(i))
    }

  var i=0
  while (i < entries.length){
    println(entries(i))
    i+=1
  }
val filteredMap= map4.filter{ case (k,_) => k%2==0 }
    println(filteredMap)

    val filteredMap1= map4.filter{ case (_,v) => v.startsWith("a") }
    println(filteredMap1)

val updatedMap=map4.map{ case (key,value) => (key*2, value.toUpperCase )}
    println(updatedMap)

 val reducedMap=map4.keys.reduce(_+_)
    println(reducedMap)


    val map5 = Map("Amit" -> 85, "Rahul" -> 90)
    val map6 = Map("Neha" -> 95, "Priya" -> 88) // Merge two maps into a new one
    val  mergedMap =map5 ++ map6
    println(mergedMap)

  }

}
