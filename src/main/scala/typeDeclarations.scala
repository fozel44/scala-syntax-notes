object typeDeclarations {
  def main(args: Array[String]): Unit = {
    //Burada kullanılan (Double,Double,Double) yerine type decleration kullanılabilir.
    def addVect(v1:(Double,Double,Double),v2:(Double,Double,Double)):(Double,Double,Double) = (v1._1 + v2._1,v1._2+v2._2,v1._3+v2._3)
    // asagıdakı seklıyle bır type declare etmek daha kullanıslıdır
    type Vect3 = (Double,Double,Double)
    def addVect2(v1:Vect3,v2:Vect3,v3:Vect3):Vect3 = {
      (v1._1+v2._1+v3._1,v1._2+v2._2+v3._2,v1._3+v2._3+v3._3)
    }
    println(addVect((4,5,6),(4,5,6)))
    println(addVect2((1,2,3),(4,5,6),(4,5,6)))

  }
}
