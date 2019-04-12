package graphSearch

import org.scalatest.FunSuite

class DFS extends FunSuite {

  test(testName = "graphSearch DFS - String search") {

    val stringGraph = new graphSearch.Graph[String]

    stringGraph.g = Map(
      "Apple" -> List("Banana", "Pear", "Grape"),
      "Banana" -> List("Apple", "Plum"),
      "Pear" -> List("Apple", "Plum"),
      "Grape" -> List("Apple", "Plum"),
      "Plum" -> List("Banana", "Pear", "Grape")
    )

    val res = stringGraph.DFS(start = "Apple")

    assert(res == List("Apple", "Banana", "Plum", "Pear", "Grape"))
  }

  test(testName = "graphSearch DFS - Integer search") {

    val intGraph = new graphSearch.Graph[Int]

    intGraph.g = Map(
      1 -> List(2, 4),
      2 -> List(1, 3),
      3 -> List(2, 4),
      4 -> List(1, 3)
    )

    val res = intGraph.DFS(start = 3)

    assert(res === List(3, 2, 1, 4))
  }

}
