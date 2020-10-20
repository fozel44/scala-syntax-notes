import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
object Exceptions {
  def main(args: Array[String]): Unit = {
          try {
            val f = new FileReader(("input.txt"))
          }
            catch {
              case ex: FileNotFoundException => {
                println("Bulunamayan Dosya Hatası")
              }
              case ex:IOException =>{
                println("IOException Hatası")
              }
   }
    finally {
      println("Çıkış Yapılıyor...")
    }

    //vıdeo exercıses

    import io.StdIn._
    def SafeReadInt:Int = {
    try {
    readInt
    } catch {
        case e:NumberFormatException =>
            println("that wasn't a valid Int. Please Try Again")
            SafeReadInt
    }
    }
    val i = SafeReadInt
  }
}
