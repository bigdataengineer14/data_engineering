object Third {

  def main (args : Array [String]): Unit = {
    var name="text"
    name=null
    println(name.length)
    val name1=None
    val length =name1.getOrElse("").length
    println(length)

    var nickName:Option[String]=Some("AAA")
    val displayName=nickName.getOrElse("No nickname")
    println(displayName)
    nickName=None
    val displayName1=nickName.getOrElse("No nickname")
    println(displayName1)


  }

}
