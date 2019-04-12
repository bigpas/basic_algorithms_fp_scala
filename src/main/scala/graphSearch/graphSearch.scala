package graphSearch

import scala.annotation.tailrec

/**
  * A Graph data structure with 2 associated search methods:
  *  1. Breadth First Search (BFS);
  *  2. Depth First Search (DFS);
  *
  * @author Pasquale Dente
  * @version 1.0
  * @todo
  * @see <https://en.wikipedia.org/wiki/>
  */

object graphSearch extends App {

  class Graph[T] {
    type Vertex = T
    type GraphMap = Map[Vertex, List[Vertex]]
    var g: GraphMap = Map()

    def BFS(start: Vertex): List[List[Vertex]] = {

      @tailrec
      def BFS0(elems: List[Vertex], visited: List[List[Vertex]]): List[List[Vertex]] = {
        val newNeighbors = elems.flatMap(g(_)).filterNot(visited.flatten.contains).distinct

        if (newNeighbors.isEmpty)
          visited
        else
          BFS0(newNeighbors, newNeighbors :: visited)
      }

      BFS0(List(start), List(List(start))).reverse
    }

    def DFS(start: Vertex): List[Vertex] = {

      def DFS0(v: Vertex, visited: List[Vertex]): List[Vertex] = {
        if (visited.contains(v))
          visited
        else {
          val neighbours: List[Vertex] = g(v).filterNot(visited.contains)
          neighbours.foldLeft(v :: visited)((b, a) => DFS0(a, b))
        }
      }

      DFS0(start, List()).reverse
    }
  }

}

