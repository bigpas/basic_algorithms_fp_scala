package selectionSort

object selectionSort extends App {

  def selectionSort[A <% Ordered[A]](list: List[A]): List[A] = {
    
    def sort(as: List[A], bs: List[A]): List[A] = as match {
      case head :: tail => select(head, tail, Nil, bs)
      case Nil => bs
    }

    def select(m: A, as: List[A], zs: List[A], bs: List[A]): List[A] = 
      as match {
        case head :: tail => if (m > head) 
                              select(m, tail, head :: zs, bs)
                              else 
                              select(head, tail, m :: zs, bs)
        case Nil => sort(zs, m :: bs)
      }

    sort(list, Nil)
  }

}

