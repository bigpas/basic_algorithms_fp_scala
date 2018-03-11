package recursion

import org.scalatest.FunSuite

class binarySearchTest extends FunSuite {

  test("Factorial - input == 5"){
    val resTest01 = factorial.factorial(5)
    assert(resTest01 == 120)
  }

  test("Factorial - input == 0"){
    val resTest02 = factorial.factorial(0)
    assert(resTest02 == 1)
  }

  test("Factorial - input == 1"){
    val resTest03 = factorial.factorial(1)
    assert(resTest03 == 1)
  }
  
}

