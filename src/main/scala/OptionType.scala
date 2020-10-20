object OptionType {
  def main(args: Array[String]): Unit = {
 val lst =List(1,2,3,4,5)
    println(lst.find(_>6))
    println(lst.find(_>3))
    //println(lst.find(_>6).get)
    println(lst.find(_>3).get)
    println("lst.find(_>6).getOrElse(0) : " +lst.find(_>6).getOrElse(0))
    println(lst.find(_>3).getOrElse(0))
    println("lst.find(_>6).map(_*2) : "+lst.find(_>6).map(_*2))
    println(lst.find(_>3).map(_*2))
    lst.find(_>3) match {
      case Some(n) =>println(n*5)
      case None =>println(0)
    }
    val result =lst.find(_>3)
    println(result)

    if (result.nonEmpty) println(result.get*5) else println(0)
  }
}