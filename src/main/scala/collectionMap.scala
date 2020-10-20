object collectionMap {
  def main(args: Array[String]): Unit = {

  }

  // Anahtarları string , değerleri int(tamsayı) olan haritalar:
  //var A:Map[Char,Int] = Map()

  // A map with keys and values.
  // val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
  val colors8: Map[String,String] = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

  val nums: Map[Int, Int] = Map()
  val char: Map[String,String]= Map("fatih" ->"sefa","eren" -> "asya" )
  println("Keys in colors : " + colors8.keys)
  println("Values in colors : " + colors8.values.mkString) //? hesaplanamadı
  println("Check if colors is empty : " + colors8.isEmpty)
  println("Check if nums is empty : " + nums.isEmpty)
  println("karakter-kaarakter ataması: " + char)


  val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
  val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")

  // use two or more Maps with ++ as operator
  var colors = colors1 ++ colors2
  println( "colors1 ++ colors2 : " + colors )

  // use two maps with ++ as method
  colors = colors1.++(colors2)
  println( "colors1.++(colors2)) : " + colors )

    // foreach = her biri için işlemi uygular. Burada işlem indis başlatır  her bir key için tek tek uygular sonuna kadar devam eder.
  val colors9 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF","peru" -> "#CD853F")

  colors9.keys.foreach{ i =>
    print( "Key = " + i )
    println(" Value = " + colors9(i) )
  }

  //contains = içerip içermediğini sorgulanması
  val colors10 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

  if( colors10.contains( "red" )) {
    println("Red key exists with value :"  + colors10("red"))
  } else {
    println("Red key does not exist")
  }

  if( colors10.contains( "maroon" )) {
    println("Maroon key exists with value :"  + colors10("maroon"))
  } else {
    println("Maroon key does not exist")
  }

}

