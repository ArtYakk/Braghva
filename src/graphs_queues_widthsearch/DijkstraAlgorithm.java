package graphs_queues_widthsearch;

import java.util.*;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        Map<String, Node> graph = new HashMap<>(); // Создаём граф *

        Node start = new Node("start"); // Создаём узлы
        Node a = new Node("a");
        Node b = new Node("b");
        Node end = new Node("end");

        start.addNeighbour(a, 6); // Добавляем соседей каждому узлу
        start.addNeighbour(b, 2);
        a.addNeighbour(end, 1);
        b.addNeighbour(a, 3);
        b.addNeighbour(end, 5);

        graph.put("start", start); // Добавляем узлы в граф
        graph.put("a", a);
        graph.put("b", b);
        graph.put("end", end);

        Map<Node, Integer> costs = new HashMap<>(); // Хеш-таблица стоимости узлов *
        costs.put(a, 6);
        costs.put(b, 2);
        costs.put(end, Integer.MAX_VALUE);

        Map<Node, Node> parents = new HashMap<>(); // Хеш-таблица родителей узлов *
        parents.put(a, start);
        parents.put(b, start);
        parents.put(end, null);




    }
}

class Node{
    String title;
   private Map<Node, Integer> neighbours = new HashMap<>(); // Хеш-таблица соседей <Узел, расстояние до него> **

    public Node(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void addNeighbour(Node node, Integer cost){
        neighbours.put(node, cost);
    }


    public Map<Node, Integer> getNeighbours(){
        return neighbours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(title, node.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return  title;
    }

}
