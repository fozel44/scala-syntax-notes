import java.io._

  class Point(val xc: Int, val yc: Int) {

    var x : Int = xc
    var y : Int = yc

    def move(dx: Int, dy: Int) {
        x=x + dx
        y=y + dy
        println("point x lokasyonu:" + x);
        println("point y lokasyonu:" + y);
    }
  }


class Locaticon (override val xc: Int, override val yc: Int, val zc :Int)
                extends Point(xc,yc){
                var z: Int =zc

    def move(dx: Int, dy: Int, dz: Int): Unit = {
            x = x + dx
            y= y + dy
            z= z + dz
            println("point x lokasyonu:" + x);
            println("point y loaksyonu:"+y);
            println("point z loaksyonu:" +z);
 }

    }



    object classes {

    def main(args: Array[String]): Unit = {
      val loc =new Locaticon(10, 20,15);

      loc.move(10,10,5);
    }}
