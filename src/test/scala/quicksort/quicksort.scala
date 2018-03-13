package quicksort

import org.scalatest.FunSuite

class binarySearchTest extends FunSuite {

  test("quicksort - successful case"){
    val resTest01 = quicksort.quicksort(data = Vector(4, 5, 0, 2, 200, 7, 33, 10, 1000))
    assert(resTest01 == Vector(4, 5, 0, 2, 200, 7, 33, 10, 1000).sorted)
  }

  test("quicksort - return one element case"){
    val resTest02 = quicksort.quicksort(data = Vector(4))
    assert(resTest02 == Vector(4.0))
  }

  test("quicksort - return empty vector case"){
    val resTest02 = quicksort.quicksort(data = Vector())
    assert(resTest02 == Vector())
  }
  
}