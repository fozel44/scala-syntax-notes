import io.StdIn._
object ifclauses {

  def main(args: Array[String]): Unit = {

    var x=30;

    if (x==10){
      println("deger 10 a denk");
    }
    else if (x==20) {
      println("deger 20 a ddenk")
    }
    else if (x==30){
      println("deger 30 a denk")
    }
    else {
      println("else statement")
    }

    val age = 18
    val response = if(age>=21) "Come in" else "Get Lost"
    println(response)
    var response2= ""
    if(age>=21) response2="Come in" else response2="Get Lost"
    println(response2)

    // sadece println kullanılarak da verilebilir


    // nesting ifs
   /* val order = readLine
    val size = readLine

    val price = if (order == "food") {
            if(size.toLowerCase.startsWith("s")) {
              2.0
            } else if (size.toLowerCase.startsWith("m")){
              2.5
            } else if (size.toLowerCase.startsWith("l")) {
              3.0
            }
    } else if (order == "drink") {
           if (size.toLowerCase.startsWith("s")) {
             1.0
           } else if (size.toLowerCase.startsWith("m")) {
             1.4
           } else if (size.toLowerCase.startsWith("l")) {
               1.8
           }
    } else if (order == "menu") {
           if (size.toLowerCase.startsWith("s")) {
             2.8
           } else if (size.toLowerCase.startsWith("m")) {
             3.5
           } else if (size.toLowerCase.startsWith("l")) {
             4.0
           }
    } else {
      0.0
    }
      println(price)*/


 //fonksyonlarla içiçe ifler
def calcConcessionCost(order:String,size:String):Double = {
    if (order == "food") {
    if(size.toLowerCase.startsWith("s")) {
     2.0
    } else if (size.toLowerCase.startsWith("m")){
     2.5
    } else if (size.toLowerCase.startsWith("l")) {
     3.0
    } else 0.0
}   else if (order == "drink") {
    if (size.toLowerCase.startsWith("s")) {
    1.0
    } else if (size.toLowerCase.startsWith("m")) {
     1.4
    } else if (size.toLowerCase.startsWith("l")) {
     1.8
    } else 0.0
    } else if (order == "menu") {
    if (size.toLowerCase.startsWith("s")) {
    2.8
    } else if (size.toLowerCase.startsWith("m")) {
    3.5
    } else if (size.toLowerCase.startsWith("l")) {
    4.0
    } else 0.0
    } else {
    0.0
    }
   }
  val o = readLine
  val s = readLine
  val price = calcConcessionCost(o, s)
    println(price)

  }
}