package array

object OddEvenList {
  def main(args: Array[String]):Unit = {

    val list = List( List(1,2,3), List(4,5), List(6,7,8))

    list.flatten.foreach(num => if(num%2 == 0) println(s"$num is even") else println(s"$num is odd"))
  }
}
