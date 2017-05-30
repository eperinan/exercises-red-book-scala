package isSorted

import org.scalatest._

class FunctionsSpec extends FlatSpec with Matchers {

  "Function isSorted" should "thrown an exception in empty case" in {
    val arrayOrdered = Array()
    a[IllegalArgumentException] should be thrownBy {
      Functions.isSorted(arrayOrdered, (a: Int, b: Int) => a > b)
    }
  }

  it should "pass array sorted" in {
    val arrayOrdered = Array(10, 9, 5)
    Functions.isSorted(arrayOrdered, (a: Int, b: Int) => a > b) should be(true)
  }

  it should "pass array unsorted" in {
    val arrayOrdered = Array(1, 9, 5)
    Functions.isSorted(arrayOrdered, (a: Int, b: Int) => a > b) should be(false)
  }
}