package array

object largestNum {
  def main(args: Array[String]): Unit = {

    val num = 766
    val strNum = num.toString
    val strSize = strNum.length
    var arr = new Array[String](strSize + 1)
    var arrIndex = 0
    var strIndex = 0
    var flag = 0

    for(i <- 0 to strSize){
      if(flag == 0){
        if(strNum(strIndex) > '5'){
          arr(arrIndex) = strNum(strIndex).toString

          arrIndex = arrIndex + 1
          strIndex = strIndex + 1
        } else if(strNum(strIndex) < '5' || strIndex == (strSize + 1)){
          arr(arrIndex) = "5"
          flag = 1
          arrIndex = arrIndex + 1
        }
      } else {
        arr(arrIndex) = strNum(strIndex).toString
        arrIndex = arrIndex + 1
        strIndex = strIndex + 1
      }

      //println(i)
    }

    println(arr.mkString(" "))

  }
}
