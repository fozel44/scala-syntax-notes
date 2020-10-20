object MarkLewis {
  def main(args: Array[String]): Unit = {
     val res14=(4,"hi",4.7)
    val(age,word,price)=res14
    println(age,word,price)

    val name = "Mark Lewis"

    val spaceIndex= name.indexOf(" ")
    println(name.substring(spaceIndex+1)+", "+name.substring(0,spaceIndex))
    val ( first,last) = name.splitAt(spaceIndex)
    println(first,last)
    println(last.trim+", "+first)
    println(s"${last.trim}, $first")
  }
}
