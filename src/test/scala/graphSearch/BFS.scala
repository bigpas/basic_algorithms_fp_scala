package graphSearch

import org.scalatest.FunSuite

class searchGraph extends FunSuite {

  test(testName = "graphSearch - String search example") {

    val sGraph = new graphSearch.Graph[String]

    sGraph.g = Map("Apple"  -> List ("Banana","Pear","Grape"),
                   "Banana" -> List("Apple","Plum"),
                   "Pear"   -> List("Apple","Plum"),
                   "Grape"  -> List("Apple","Plum"),
                   "Plum"   -> List ("Banana","Pear","Grape")
                  )

    val res = sGraph.BFS(start = "Apple")

    assert(res == List(List("Apple"), List("Banana", "Pear", "Grape"), List("Plum")))
  }

  test(testName = "graphSearch - Integer search example") {

    val intGraph = new graphSearch.Graph[Int]

    intGraph.g = Map(
                    1 -> List(2,4),
                    2 -> List(1,3),
                    3 -> List(2,4),
                    4 -> List(1,3)
                  )

    val res = intGraph.BFS(start = 1)

    assert(res === List(List(1), List(2, 4), List(3)))
  }

}
