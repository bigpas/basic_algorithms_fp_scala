package quicksort

import scala.util.Random
// import scala.annotation.tailrec

/**
  * A quicksort algorithm implemented in a Functional Style.
  *
  
  * @param data Vector in Scala is the "go to" immutable, indexed Sequence
  * @author Pasquale Dente
  * @version 1.0
  * @todo Make it tailrecursive
  * @see 
  */

object quicksort extends App {

  def quicksort(data: Vector[Double]): Vector[Double] = {

      if(data.length < 2) data
      
      else {
        val pivot = data(Random.nextInt(data.length - 0))
        val less  = data.filter(_ <= pivot)
        val greater = data.filter(_ > pivot)
        quicksort(less)++quicksort(greater)
      }
    }

}