package recFib

import org.scalatest._

class FunctionsSpec extends FlatSpec with Matchers {

  "Function Fibonacci recursive" should "pass basic cases" in {
    Functions.fib(0) should be (0)
    Functions.fib(1) should be (1)
  }

  it should "pass the first ten elements" in {
    Functions.fib(0) should be (0)
    Functions.fib(1) should be (1)
    Functions.fib(2) should be (1)
    Functions.fib(3) should be (2)
    Functions.fib(4) should be (3)
    Functions.fib(5) should be (5)
    Functions.fib(6) should be (8)
    Functions.fib(7) should be (13)
    Functions.fib(8) should be (21)
    Functions.fib(9) should be (34)
  }
}