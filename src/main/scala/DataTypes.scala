object DataTypes {
/*
  def main(args: Array[String]): Unit = {
    var myVar : String = "Foo"
    println(myVar)

    myVar="fatih"
    println(myVar)

    val myvVar2 ="asya" //değişmeyen değişken
    println(myvVar2)

    /*myvVar2 = "asian"
    println(myvVar2)*/
*/

/* scope */

  var name = "eren"
    def main(args: Array[String]): Unit = {

      println(name)
      setName()
      println(name)
    }

    def setName():Unit= {
      name="ahmet"
    }


}
