object CollectionList {
  def main(args: Array[String]): Unit = {


    val fruit2 ="mangoes" :: ("banana"::Nil)
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = 1 :: (2 :: (3 :: (4 :: Nil))) /* soldan sağa elemanları bir liste içine alıı*/
    val empty = Nil
    val dim = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil


    println(dim,empty,nums,fruit)
    println( "Head of fruit : " + fruit.head )
    println( "Tail of fruit : " + fruit.tail )
    println( "Check if fruit is empty : " + fruit.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )

      val fruit4 = fruit.::: (fruit2)  // fruit 3'ün sagdan sola listelenmiş hali =="fruit2 ::: fruit" 'e denk gelir.
      val fruit5 =List.concat(fruit,fruit2)
      val fruit3 = fruit::: fruit2 // öğeleri siktir et sen bana listeleri tek liste altında getir soldan saga
    println("fruit ::: fruit2: " + fruit3)
    println("fruit:::(fruit2):" + fruit4)
    println("List.concat(fruit,fruit2: " + fruit5) == fruit3

    val fruit6 = List.fill(3)("apples") // elma kelimesini 3 kez listeye doldurur.
    println( "fruit : " + fruit6  )

    val num2 = List.fill(10)(2)         // 2'yi, 10 kez listeye dolrurur.
    println( "num : " + num2  )

    println("reverse fruit: " + fruit.reverse) // ters çevirir.


    //lıstfunctions
  import io.StdIn._
    println("5 sayı  girin.Her biri için enter a basın ")
    def inputList (n:Int):List[Int] = {
      if(n<1) Nil
      else readInt :: inputList(n-1)
    }
val lst = inputList(5)
    println(lst)
/*
    def operateOnList(lst:List[Int], base:Int , f:(Int,Int) => Int):Int = {
      if(lst==Nil) base
      else f(lst.head, operateOnList(lst.tail,base,f))
    }
*/

    //match ile üstteki recursive fonksiyonun muadilidir.
    def operateOnList(lst: List[Int], base: 0, f:(Int,Int) => Int):Int = lst match {
      case Nil => base
      case h :: t => f(h,operateOnList(t,base,f)) //h ve t kullanımı lıstlrın bırlestırme ıslmındekı soldakı degerı sagdakının
                                                  // basına eklemesı olayından kaynaklanır.
                                                  //boylece h yi t ye ekledikce h doğal head t de doğal tail oluyor.
                                                  // bir kısa kullanım değildir a ve b de yazılabilir.
    }

    println(operateOnList(lst,0,_+_))

def fillList(n:Int,v:Double):List[Double] = {
  if(n<1) Nil
  else v :: fillList(n-1,v)
}
    println(fillList(10,Math.random))

/*------------------------------------------------------------------*/
  var arr: Array[Int]=Array()
    var a: Array[Int]=Array()
    var i =0
    //arr=Array.fill(10)({i += 1 ;i})
    arr=Array.tabulate(10)(i=>i*i)  //fill komutu ile aynı işi yapar.
    arr.foreach{println(_)} //diziler foreach ile yazdırılır her biri için yaz anlamındaır.
    //AŞAĞIDA "//" KALDIRARAK ÇALIŞTIR
    //a=arr.init // tailin texrsidir. sonuncusu hariç diğerlerini verir.
    //println(arr.last) //sadece son öğeyi gösterir.
    //a=arr.slice(2,4) // 2. ve 4. elemanlar arası dilimi gösterir. dizilerde 0. eleman 1. elemandır
    //(arr.splitAt(3))._1.foreach{println(_)} // 3. elemandan sonrasını farkli biz dizin  yapar ( parçalar).
    //println("2.parça") // iki parça tupple oldugu ıcın array kısmını yazdırmak ıcın ._1 dıyerek ılgılı array parcası seçildi.
    //(arr.splitAt(3))._2.foreach{println(_)} // split at 0 oldugunda ilk parça boş kalır 2. parça da tüm dizini içine alır
    //a=arr.take(3) // 3. ye kadar olan elemanları alır ( dizilerde 0. dan baslar saymaya )
    //a=arr.dropRight(3) // dizinin sağından 3 elemanını  atar
    //a=arr.takeRight(3) // dizinin sağından 3 elemanını alır.
    //a=arr.drop(2) //dizinin ilk 2 elemanını atar
    // SONUCU BOOLEAN DONENLER VE DİĞERLERİ. PRİNTLN İLE YAZDIRILIR.
    //println(arr.contains(3)) // "3" ü içeriyor mu - boolean
    //println(arr.endsWith(Array(49,64,81))) // sonu bununla mı bitiyor.
    //arr.endsWith(List(49,64,81)) // sonu bununla mı bitiyor. - liste olarak dönderir
    //arr.isEmpty //  boş mudur
    //arr.nonEmpty //  boş değil midir
    //arr.startsWith(Array(0,1)) //  bununla mı başlıyor
    //arr.indexOf(1) // "1"in indexi kaçtır.
    //arr.indexOf(11) // 11 in indexi kaçtır- 11 olmaıgı için negatif int olarak  donecektır
    //arr.lastIndexOf(1) // dizideki son "1" in  indexi kaçtır
    //arr.indexOf(1,5) // 5. indexten sonra gelen 1 in indexi kaçtır - olmadığı için nagetif int dönecektır.
    //arr.diff(Array(81,64,49))
    //arr.distinc // aynı olan elamanları bırlestırır. kac farklı eleman oldugunu gosterır
    //arr.mkString("(",",",")") // arrayı yazdırmank ıcın kullanılır aksı halde locak adını verecekdır
    //a=arr.patch(2,Nil,3) //2. indexten baslayarak kendisi dahil 3 indexe nil yerleştir.
    //a=arr.parch(2,Array(77,88,99),3) //ornek
    //arr.reverse // tersin çevirir
    //arr.tolist // listeye çevirir
    //arr.toArray // array e cevirir
    val lst1=List("One","Two","Three","Four")
    //arr.zip(lst1) // indexleri kaşılatırarak birleştirir
    //lst1.zip(arr) // "
    //arr.zipWithIndex // her elemanın indexini yanında yazar.
    //lst1.zipWithIndex // "
    //arr.min // arr. dizisindeki en küçük değeri getirir
    //lst1.min // lst1 "
    //arr.max // arr dizisindeki en büyük değeri getirir
    //lst1.max // lst1 "
    //arr.sum // arr dizisinin elemanlarının toplamını bulan bir donksiyona sokar
    //lst.sum //lst1 " -- ancak bu durum hata verecektir cunku lst1 listesi numeric değildir
    //arr.map(_*2) // bir dizinin elemanlarına uygular ve yeni bir collection olarak verir map foksiyorunu.
    //arr.map(i=>"hi "*i) // dizinin elemanlarının sayısı yerine hi yazar
    //arr.filter(i=> i%2==0) // dizideki çift sayıları getirir
    //arr.filter(i=> i%2==0).map(_*2) // dizideki çift sayıların 2 katlarını getirir
    //arr.dropWhile(_<9) // 9 dan önceki elemanları atarak getirir.
    //arr.exists(_%7==0) // 7 ye tam bölünebilen sayıları getirir.
    // NOT VE "!" BOOLEAN OLARAK GELEN SONUCU TERSİNE DÖNDERİR.
    //arr.filterNot(i=> i%2==1) // 2 ye tam bolunenleri getirir
    //arr.filterNot(i=> !(i%2==1)) // tek sayıları getirir.
    /*-------------*/
    //arr.map(n=> n*n) // dizinin elemanlarını  kendis iile çarpar.
    //arr.map(n => Array.fill(n)(n)) // dizinin elemanlarını kendi ınt degerı kadar sayıda bir array haline getirir.tum eleman olan arrayleride bir array içinde toplar
    //println(arr.flatMap(n => Array.fill(n)(n))) // yukarıdaki işlemı her bir eleman için farklı array olusturmak yerıne dümdüz tek array olarak yapar)
    //arr.forall(_<100) // hepsi için. boolean döner. 100 den buyuk bir eleman varsa false verir
    //arr.forall(_<70) // 70 den buyuk bır eleman varsa false doner
    //arr.indexWhere(_%2==0) // ilk rastladığı çift sayının bulundupu indeşi dönderir.
    //arr.indexWhere(_%3==0) // ilk rastladığı tek sayının bulundupu indeşi dönderir.
    //arr.indexWhere(_==49)  //  ilk rastladığı "49" elemanının hangi indexte oldugunu getirir
    //arr.lastIndexWhere(_== 49) // son rastladığı "49" elemanının hangi indexte oldugunu getirir.
    //arr.lastIndexWhere(_%3==0) // son rastladıpı 3 e tam bolunebilen sayının indexini getirir.
    //arr.partition(_%2==0) // 2 ye tam bolunebilen leri bir array, bolunemeyenleri baska bir array  olarak getirir.
    //val (evens,odds) = a.partition(_%2==0)
    //println(evens,odds)
    //arr.takeWhile(_%3==0) // 3 e bolunebilenleri getirir. ( take den farkı while kullanarak içine fonksiyon yazılabilmesi)
   /*-----------reduce&fold------------------*/
    arr.reduceLeft(_+_) // isleme soldan baslayarak toplama islemini gerceklestirir.
    arr.sum // yukarıdakı reduce left ilemı ıle aynı sonucu verır
    arr.reduceLeft((a,b)=>{println(a+" "+b); a+b}) // içierisinde paramatre larak fonsiyon alabiliyor. buradaki fonksiyon soldan baslayarak önce a ve b yi yazdırıyor ardındna a+b yı yazdırıyor ve artık yeni a bir onceki a+b işlemının sonucu oluyor.sonraki satırda a=a+b , 3.index i yazıyor.
    arr.reduceRight((a,b)=>{println(a+" "+b); a+b}) // aynı ıslemı sag taraftan baslayarak yapar ve ikisinde sonuclar farklı olur
    arr.reduceLeft((a,b)=>{println(a+" "+b); a-b}) // bu defa çıkarma işlemı uygulayarak yapar
    arr.reduceRight((a,b)=>{println(a+" "+b); a-b}) // bu defa cıkarma ıslemı uygulayarak yapar.
    arr.foldLeft(0)(_+_) //
    arr.foldLeft("")(_+_) //
    arr.foldLeft("")(_+_+",") //
a.foreach{println(_)}



  }
}