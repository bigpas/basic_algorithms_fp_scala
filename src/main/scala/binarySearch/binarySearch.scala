package binarySearch

import scala.annotation.tailrec

/**
  * A binary search algorithm implemented in a Functional Style.
  * Binary search begins by comparing the middle element of the array with the target value. 
  * If the target value matches the middle element, 
  * its position in the array is returned. 
  * If the target value is less than or greater than the middle element, 
  * the search continues in the lower or upper half of the array, respectively, 
  * eliminating the other half from consideration.
  *
  
  * @param data A sorted Vector. Vector in Scala is the "go to" immutable, indexed Sequence
  * @param target The target.
  * @author Pasquale Dente
  * @version 1.0
  * @todo Add more functionality. Fast failing error: if(data != data.sorted) Error Message "Input Vector is not Sorted"
  * @see <https://en.wikipedia.org/wiki/Binary_search_algorithm>
  */

object binarySearch extends App{

type Index = Int

  def binarySearch(data: Vector[Double], target: Double): Option[Index] = {

    @tailrec
    def go(low: Index, high: Index): Option[Index] = {
      if(low > high)
        None
      else {
        val mid: Index = low + high

        data(mid) match {
          case mv if (mv == target) => Some(mid)
          case mv if (mv <= target) => go(mid + 1, high)
          case _ => go(low, mid - 1)
        }
      }
    }
    go(0, (data.size - 1))
  }

}

