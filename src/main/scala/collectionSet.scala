import scala.collection.mutable

object collectionSet {
  def main(args: Array[String]) {
    val num1 = mutable.Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)
    // Listeden farklı olarak immutabledır. İsteğe bağlı olarak "mutable.set" olabilir.
    // En Önemli Farkı :: syntax i yerine ++ kullanılı ve liste içinde tekrar eden eleman olamaz.

    // iki set arasındaki ortak değerleri bulurlar. (&)(intersect)

    val num3 =  Set(5,33) ++ num1
    println( "num3 : " + num3)
    println( "num1.&(num2) : " + num1.&(num2) )
    println( "num1.intersect(num2) : " + num1.intersect(num2) )
  }
}

