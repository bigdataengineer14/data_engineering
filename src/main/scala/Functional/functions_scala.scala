package Functional

object functions_scala {
  def main(args:Array[String]): Unit = {

  }
  //non parameterized function, hardcoded values f
  def myfunction(): Unit = {
    val name="omkar"
    println(name)
  }
  myfunction()
  println("Another Step")
  myfunction()

  //parameterized function, generic/dynamic behaviour, every time call with new values
  def myfunction1(name:String, age:Int): Unit = {
      println(name, age)
      println(name.toUpperCase)
  }
  myfunction1("Tejas", 25)
  myfunction1("Pallavi", 23)

  //Returning an Array of String from a function,
  // last statement of function should have value type= return type
  def myfunction2(arr1:Array[String]): Array[String] = {
    val name="omkar"
    println(name.toUpperCase)
    arr1
  }
   println(myfunction2(Array("Tejas", "Pallvi", "Pratik")).mkString(","))

//returning a Boolean value so last statement of function is of boolean type
  def myfunction3(name:String): Boolean = {
    val isActive=true
    if(name.equalsIgnoreCase("Himanshu")){
      println("Match found")
    }
   isActive
  }
  println(myfunction3("Himanshu"))

  ///parameterized function + with return type as String
  // FIRST CLASS FUNCTION:  Can store return value into a variable and reuse it
  def myfunction4(name:String, age:Int): String = {
        println(name, age)
        println(name.toUpperCase)
       name
    }
  val result = myfunction4("Divya", 21)
  println(result.length)

  //FIRST CLASS FUNCTION: Can pass one function as argument to other function
  def passAsArgument(func:String): Unit = {
    println("Passing Function as an argument", func)
  }
  //passed myfunction() as argument to passAsArgument function
  passAsArgument(myfunction4("Santosh", 24))


  // FIRST CLASS FUNCTION: Returning a function from other function
  def returnFromAFunction(name:String, age:Int): String = {
    println("Returning a function from another function")
    // Using  myfunction4() as return statement in this function,
    // so function can be used as return statement for other function
    myfunction4(name, age)
  }
  returnFromAFunction("Preethi", 25)

  val greet = (name: String) => s"Namaste, $name!"
  println(greet("Amit"))

}
