object First {

  def sum(a1:Int, b1:Int): Int = {
    val c=a1+b1
    c
  }
  def main (args : Array [String]): Unit = {
    val a=10
    val b=5
    println(a==b)
    println(a!=b)
    println(a>b)
    println(a>=b)
    println(a<=b)
    println(a<b)
    println((a+b)==(a-b))

    val a2="text"
    val b2="text"
    val c2=new String("text")

    // == comparision, equals() - value of variables
    println(a2==b2)
    println(a2.equals(b2))
    println(a2.equals(c2))
    println(a2 eq c2)
    println(System.identityHashCode(a2))
    println(System.identityHashCode(b2))
    println(System.identityHashCode(c2))

    val result=sum(3,10)
    print(result)

    val age =25
    // age=26
    var age1 =25
    age1=26
    age1=27

    var age2:Any=25
      age2="text"
    val active: Char = 'Y'
//    val myName="Hello"
    val num=9999999999l
    val num2=3.14f
    val num3=388.8888
    val isActive=true
    println(num.getClass)
    println(num2.getClass)
    println(num3.getClass)
    println(isActive.getClass)

    val num1: Int = 99 // 2147483647
    val num4:Long=2147483648l
    val num5:BigInt=BigInt("999999999999999999999999999999999999999999999999999999999")



 }

}


