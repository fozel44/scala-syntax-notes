import scala.io.Source

object PlayingWithData {
  type NameData = (String,Int,String,Int)
  def parseLines(line:String):NameData={

    var x=line.split(",")

    (x(1),x(2).toInt,x(3),x(4).toInt)
  }

  def main(args: Array[String]): Unit = {

    val filename = "C:\\Users\\gsft\\Desktop\\ND.txt"
    var nameLines =Array.fill(46069)("")
    var i = 0
    for (line <- Source.fromFile(filename).getLines) {

      nameLines(i) = line
      i=i+1

    }


    val nameData = nameLines.map(parseLines)
    nameData.foreach(println)
    println("F ve 1988 kari isimleri")

    var f1988 = nameData.filter(i => i._1=="F" && i._2==1988).foreach(println)

    //val maxnames= f1988.map().max
    //println(maxnames)
  }
}
