object optionType {

  def main(args:Array[String]): Unit = {

    var name2="text"
    //  name2=null
    println(name2.length)

    val name:Option[String]=None
    println(name.getOrElse("Not provided"))

    val name1:Option[String]=Some("Naina")
    println(name1.getOrElse("Not provided"))

    if(name1.isDefined){
      println(name1.get)
    }
    else{
      println("No Value")
    }

  }

}
