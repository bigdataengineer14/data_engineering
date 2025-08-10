package ObjectOrientation

class Inheritance {
  private val secret="This is scala"
  protected def showSecret(): Unit = {
    println("From Inheritance Class")
  }
  protected val newSecret="I love scala"
}
// COMPANION OBJECT
object Inheritance {
 val I1=new Inheritance()
 println(I1.secret)
  I1.showSecret()
}

object mainApp {
  def main(args: Array[String]): Unit = {
    val I1=new Inheritance
  }
}

class AccessModifiers extends Inheritance {
  val A1= new AccessModifiers()
  println(A1.newSecret)
  A1.showSecret()
}


