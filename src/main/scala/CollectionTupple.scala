object CollectionTupple {
  def main(args: Array[String]): Unit = {
    val t = new Tuple3[Int,String,String](1,"1","dasd") //22 elemana kadar tupple kullanılacbılır
                                                        //22 eleman sonrasında lıste veya set kullanmah gerekiyor.

              println(t)
    val t1 = (4,3,2,1)
    val sum = t1._1 + t1._2 + t1._3 + t1._4
              t1.productIterator.foreach{i=>println("değer = " + i)} // Tuple.productIterator() methodunu kullanarak yineleme yapılabilir.
                                                                    //  .foreach gibi bir parametre eklemediğimizde çalışmayacaktır.
    println( "elementlerin toplamı: "  + sum )


    val t2 = new Tuple3(1, "hello", Console)

    println("Stringe Dönüştürülmüş: " + t2.toString() )


    val t3 = new Tuple2("Scala", "hello")

    println("Swapped Tuple: " + t3.swap )
  }
}
