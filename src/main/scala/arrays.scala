object arrays {
  def main(args: Array[String]) {
    /*var myList = Array(1.9, 2.9, 3.4, 3.5)

    // Print all the array elements
    for ( x <- myList ) {
      println( x )
    }

    // Summing all elements
    var total = 0.0;

    for ( i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("\nTotal is " + total);

    // Finding the largest element
    var max = myList(0);

    for ( i <- 1 to (myList.length - 1) ) {
      if (myList(i) > max) max = myList(i);
    }

    println("\nMax is " + max);

    var min = myList(0);
    for (i <- 1 to (myList.length -1)) {
      if (myList(i) < min) min = myList(i)
    }
    println("\nmin is" + -min)

    var averrage = total/myList.length
        println("\naverrage" + averrage);
  */

    var myMatrix =Array.ofDim[Int](3,3)

    for (i<- 0 to 2) {
      for (j<- 0 to 2) {
        myMatrix(i)(j)=j;
      }
    }
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" "+myMatrix(i)(j));
      }
    println()

    }
println();
    var totalmatrix=0

      for (i<- 0 to 2) {
        for (j <- 0 to 2) {
          totalmatrix=totalmatrix+myMatrix(i)(j)
        }
      }
    println("toplam matrix: "  + totalmatrix)

    var min = myMatrix(0)(0)
    var max = myMatrix(0)(0)
      for (i <- 0 to 2) {
        for (j <- 0 to 2) {
          if (myMatrix(i)(j)< min) min = myMatrix(i)(j)
          if (myMatrix(i)(j)> max) max= myMatrix(i)(j)
        }
      }
println("minimum matrix: "  + min)
println("maximum matrix : " + max)
  var averrage= totalmatrix/myMatrix.length
    println("matris ortalaması: " + averrage)


    //vıdeo exercıses recursıve fıll array

    def fillArray (arr:Array[Int],v:Int,i:Int):Unit = {
      if(i<arr.length) {
        arr(i)=v
        fillArray(arr,v,i+1)
      }
    }
val nums = Array(1,1,1,1,1,1,1)
    fillArray(nums,99,0)
    println(nums)

    // bu operasyon  fonksyon cagırılırken ılgılı array e ılgılı ıslemı yapar. ıslem cagırılırken belırtılır.
    def operateOnArray(arr:Array[Int],i:Int,f:(Int,Int)=>Int):Int={
      if(i<arr.length-1) {
        f(arr(i),operateOnArray(arr,i+1,f))
      } else {
        arr(i) //base case
      }
    }
val nums2= Array(1,2,3,4,5,6)
    println("operatıon cıktısı " + operateOnArray(nums2,0,_*_)) //ıslem belırtılen nokta
  }
}
