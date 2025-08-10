package Functional

object Second {
  def main (args : Array [String]): Unit = {
    val x = 5
    val y = 3

    println(x & y)
    println(x | y)
    println(x ^ y)
    println(~x)

    val read = 1
    val edit = 2
    val delete = 4
    val share = 8
    var userPermission = read | edit  // 0001 | 0010 = 0011 (which is 3)
    if ((userPermission & delete) != 0) {   // 0011
      println("user has edit permission") // 0010
    }
    else {
      println("user does not has delete permission")
    }

    userPermission = userPermission ^ delete
    println(userPermission)
    userPermission |= delete // userPermission = userPermission | delete
    userPermission = userPermission & ~edit  // 0111 & 1101 = 0101 → read + delete

    val key = 123
    val original = 77
    val encrypted = original ^ key
    println(encrypted)
    val decrypted = encrypted ^ key
    println(decrypted)
  }
}
