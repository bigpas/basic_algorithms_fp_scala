package selectionSort

import org.scalatest.FunSuite

class selectionSortTest extends FunSuite {

  test("selection sort - integers"){
    val resTest01 = selectionSort.selectionSort(List(234, 121, 11, 789))
    assert(resTest01 == List(11, 121, 234, 789))
  }

  test("selection sort - double"){
    val resTest02 = selectionSort.selectionSort(List(234.324, 121.0, 11.31, 789.22))
    assert(resTest02 == List(11.31, 121.0, 234.324, 789.22))
  }

  test("binarySearch - empty list"){
    val resTest03 = selectionSort.selectionSort(List())
    assert(resTest03 == List())
  }
  
}
