import  scala.io.StdIn._
object TimeInSeconds {
  def main(args: Array[String]): Unit = {
    println("Buraya Bir Saat Yazarsanız ör. 11:11:11 bunu saniye cinsinden dönüştürerek verecektir" )
    val time = readLine
      val firstColoumn= time.indexOf(":")
      val secondColoumn= time.lastIndexOf(":")
      val hours   = time.substring(0,firstColoumn).toInt
      val minutes = time.substring(firstColoumn+1,secondColoumn).toInt
      val seconds = time.substring(secondColoumn+1).toInt

    val totalseconds= hours*3600+minutes*60+seconds
    println(totalseconds)
  }
}
