package ObjectOrientation

//class parameterized_class(var name:String, age:Int) {
//  println(s"name is ${name} and age is ${age}")
//}

object runner {
  def main(args: Array[String]): Unit = {
   // val p1= new parameterized_class("Tejas", 24)
    val myLaptop = new Laptop("Dell", "Inspiron", 55000.00)
    myLaptop.showDetails()
  }
}

class Laptop(val brand: String, val model: String) {
  var price: Double = _
  // Secondary constructor
  def this(brand: String, model: String, price: Double) {
    this(brand, model)
    this.price = price
  }
  def showDetails(): Unit = {
    println(s"Laptop: $brand $model, Price: $price")
  }
}

