package array

object GeneratePrime {
  def main(args:Array[String]): Unit = {

    var count = 0

    for(j <- 2 to 100){
      var prime = true

      for(i <- 2 until j){
        if(j % i == 0)
          prime = false
      }

      if(prime == true){
        println(s"The number $j is prime")
        count += 1
      }
    }

    println(s"The number of prime numbers are $count")
  }
}
