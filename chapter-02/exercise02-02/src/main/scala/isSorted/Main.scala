package isSorted

object Functions {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    if (as.size == 0) throw new IllegalArgumentException("Empty array")
    as sameElements as.sortWith(ordered)
  }
}

object Main extends App {
  println("\nCheck isSorted works fine\n")

  val arrayOrdered = Array(10, 9, 5)
  println("arrayOrdered: " + Functions.isSorted(arrayOrdered, (a: Int, b: Int) => a > b))

  val arrayUnOrdered = Array(1, 9, 5)
  println("arrayUnOrdered: " + Functions.isSorted(arrayUnOrdered, (a: Int, b: Int) => a > b))

  try {
    val arrayEmpty = Array()
    println("arrayEmpty: " + Functions.isSorted(arrayEmpty, (a: Int, b: Int) => a > b))
  } catch {
    case e: Exception => println("Exception caught: " + e);
  }
}
