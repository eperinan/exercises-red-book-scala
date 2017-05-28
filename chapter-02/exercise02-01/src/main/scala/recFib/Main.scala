package recFib

object Functions {
  def fib(n: Int): Int = if(n <= 1) n else fib(n-1) + fib(n-2)
}

object Main extends App {
  println("\nFirst ten numbers of fibonacci serie\n")
  List.range(0, 10).foreach(item => println("Fib("+item+") :" + Functions.fib(item)))
  println("")
}
