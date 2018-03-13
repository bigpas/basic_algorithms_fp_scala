package quicksort

import scala.util.Random

/**
  * A quicksort algorithm implemented in a Functional Style.
  *
  
  * @param data Vector in Scala is the "go to" immutable, indexed Sequence
  * @author Pasquale Dente
  * @version 1.0
  * @todo
  * @see <https://en.wikipedia.org/wiki/Quicksort>
  */

object quicksort extends App {

  def quicksort(data: Vector[Double]): Vector[Double] = {

      if(data.length < 2) data
      
      else {
        val pivot = data(Random.nextInt(data.length - 0))
        //less= than the pivot and greater than the pivot
        quicksort(data.filter(_ <= pivot))++quicksort( data.filter(_ > pivot))
      }
    }

}