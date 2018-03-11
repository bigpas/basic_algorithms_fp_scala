package recursion

import scala.annotation.tailrec

object factorial extends App { 

  def factorial(x: Int): Int = {

    @tailrec
    def go(x: Int, acc: Int): Int = 
      if(x <= 1) acc
      else go(x-1, x * acc) 

    go(x, 1)
  }
}