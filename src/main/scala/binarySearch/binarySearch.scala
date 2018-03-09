package binarySearch

import scala.annotation.tailrec

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

