object StringAsCollections {
  def main(args: Array[String]): Unit = {
        val nums= Array(4,5,8,5,7,6)
    println(nums(2))
    val str = "This is a test"
    println(str(3))
    str.foreach(println)
    println(str.map(a=>a+1))  // ascii tablosundaki değerlerine 1 ekleyecektir.
    println(str.map(a => (a+1).toChar))
    println(str.count(c=>"aeiou".contains(c))) // contaıns ıcerıyor muyu sorgular. cont da sayı verır. bu işlem str de kaç tane sesli harf kullanıldığını sayar
    println(str.split(" ").toList) // " " boşlukları delimeter ( ayıraç) olarak kullanıp. cıktıyı su sekılde verecektır Array(This, is, a, test)
    val str2 = "This  is  a  Test"
    println(str.split(" ").toList) // " " boşlukları delimeter ( ayıraç) olarak kullanıp. cıktıyı su sekılde verecektır Array(This,  ""is,  ""a,  ""test)
    println(str.split(" +").toList) //// " " boşlukları delimeter ( ayıraç) olarak kullanıp önune cıkan tum boslukları ayırac olarak kullanmaya devam edıp. cıktıyı su sekılde verecektır Array(This, is, a, test)
    println("1 2 3 4 5".split(" ").map(_.toInt).toList )

  }

}
