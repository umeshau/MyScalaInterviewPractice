package array

object PrimeOrNot {
  def main(args:Array[String]):Unit = {

    val num = 6
    var prime = true

    for(i <- 2 until 6){
      if(num%i == 0)
        prime = false
    }

    println(s"the number $num being prime is $prime")
  }
}
