package Functional

object functions2_scala {

  def main(args: Array[String]): Unit = {
  }

  //Multiline function defintion
  def add2(x: Int): Int = {
    x + 2
  }

  add2(10)

  //single line function definition
  def add3(x: Int): Int = x + 2

  add3(2)

  def add4(x: Int): String = if (x >= 0) "Positive" else "negative"

  add4(5)

  //Annonymous function / Lambda expression/Function without name

  //  parameter => (Expression)
  //  x=> x+2 - X is parameter, x+2 expression

  List(1, 2, 3).map(x => x + 2)

  // x=>x+2 is equivalent to   (x:Int)=>x+2 which is equivalent to
  def add5(x: Int): Int = {
    x + 2
  }

  //Anonymous function with 1 argument
  val result = (x: Int) => x + 2
  println(result(10))

  // Anonymous function with 2 argument
  val result1 = (x: Int, y: Int) => x + y
  println(result1(10, 15))

  // passing function as argument and returning function from another function
  def operation(x: Int, y: Int, func: (Int, Int) => Int): Int = {
    func(x, y)
  }

  val result3 = operation(10, 7, (a: Int, b: Int) => a + b)
  println(result3)

  //SCOPE OF VARIABLES "LEGB" In PYTHON

  // Variable inside function block are local, outside block are global
  val age = 25

  def scopeDefinition(): Unit = {
    val age = 29
    println(age)
  }

  scopeDefinition()
  println(age)

  // Variable define within outer function which is global to inner function
  // Inner function can utilize that as it is part of its enclosing environment
  def scopeDefinition1(): () => Unit = {
    val age = 29
    println(age)

    def scope2(): Unit = {
      val newAge = age + 2
      println(newAge)
    }

    scope2
  }

  scopeDefinition1()

  // closure: nested function can use variable define in outer scope it is not define in its own scope still
  // can use it, as scala create closure for inner function, which captures the value of variable from outer
  //inner can utilizer outer scope variable and keep it alive as long as it exists
  def outer(): () => Unit = {
    val age = 30

    def inner(): Unit = {
      println(age)
    }

    inner
  }

  val result4 = outer()
  result4()

  def pureFunction(num: Int): Int = {
    num * 10
  }

  println(pureFunction(25))
  println(pureFunction(25))

  def square(n: Int): Int = {
    n * n
  }

  println(square(4))

  var total = 25

  def addToTotal(n: Int): Int = {
    total += n
    total
  }

  println(addToTotal(10))

  def addNumbers(nums: Int*): Int = {
    nums.sum
  }
}



