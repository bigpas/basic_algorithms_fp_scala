package binarySearch

import org.scalatest.FunSuite

class binarySearchTest extends FunSuite {

  test("binarySearch - successful case"){
    val resTest01 = binarySearch.binarySearch(data = Vector(1, 2, 4, 5, 7, 10, 33, 200, 1000), target = 5)
    assert(resTest01 == Some(3))
  }

  test("binarySearch - return None case"){
    val resTest02 = binarySearch.binarySearch(data = Vector(1, 2, 4, 5, 7, 10, 33, 200, 1000), target = 117)
    assert(resTest02 == None)
  }

  test("binarySearch - sort required"){
    val resTest01 = binarySearch.binarySearch(data = Vector(10, 33, 200, 1000, 1, 2, 4, 5, 7), target = 5)
    assert(resTest01 == Some(3))
  }
  
}

