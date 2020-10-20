object CombinatioraIterator {
  def main(args: Array[String]): Unit = {
    val nums = Array(1, 2, 3, 4, 5)
    nums.combinations(3).foreach(a => println(a.mkString(", ")))
    println(Iterator == nums.combinations(3))
    val a = nums.combinations(3)
    println("next " + a.next.mkString)
    println("next " + a.next.mkString)
    println("next " + a.next.mkString)
    println("next " + a.next.mkString)
    println("hasNext "+a.hasNext)
    println("next " + a.next.mkString)
    println("next " + a.next.mkString)
    println("next " + a.next.mkString)
    println("next " + a.next.mkString)
    println("next " + a.next.mkString)
    println("hasNext "+a.hasNext)
    println("next " + a.next.mkString)
    println("hasNext "+"'"+a.hasNext+ "'" + " baska bir kombinasyon kalmadı.")
    println("tabulete ile array olusturuldu "+Array.tabulate(15)(i => i).mkString(", "))
    Array.tabulate(15)(i => i).grouped(3).foreach(c => println(c.mkString(", ")))
    Array.tabulate(15)(i => i).grouped(5).foreach(c => println(c.mkString(", ")))
    nums.inits.foreach(a=> println(a.mkString(", ")))
    nums.permutations.foreach(a=>println(a.mkString(", ")))
    nums.sliding(3).foreach(a=>println(a.mkString(", ")))
    nums.tails.foreach(a=>println(a.mkString(", ")))
    println(nums.tails.toList)
    nums.permutations.toArray

  }
}
