import scala.io.StdIn._
object TimeInSecondsFunctions {
  def main(args: Array[String]): Unit = {
      def breakDownTime(Time:String):(Int,Int,Int) = {
        val firstColoumn= Time.indexOf(":")
        val secondColoumn= Time.lastIndexOf(":")
        val hours = Time.substring(0,firstColoumn).toInt
        val minutes = Time.substring(firstColoumn+1,secondColoumn).toInt
        val seconds = Time.substring(secondColoumn+1).toInt
        (hours,minutes,seconds)
      }
    def calcTotalSeconds (hours:Int,minutes:Int,seconds:Int):Int = {
      hours*3600 + minutes*60 + seconds
    }
    println("Buraya Bir Saat Yazarsanız ör. 11:11:11 bunu saniye cinsinden dönüştürerek verecektir" )
    val time = readLine
    val (hours,minutes,seconds)=breakDownTime(time)
    val totalSeconds = calcTotalSeconds(hours,minutes,seconds)
        println(totalSeconds)
  }
}
