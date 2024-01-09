package graphs_queues_widthsearch;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        Map<Node, String> graph = new HashMap<>();

        Node start = new Node("start");
        Node a = new Node("a");
        Node b = new Node("b");
        Node end = new Node("end");

        start.addNeighbour(a, 6);
        start.addNeighbour(b, 2);

        a.addNeighbour(end, 1);
        
        b.addNeighbour(a, 3);
        b.addNeighbour(end, 5);

        System.out.println("Соседи для start: " + start.getNeighbours());
        System.out.println("Соседи для A: " + a.getNeighbours());
        System.out.println("Соседи для B: " + b.getNeighbours());
        System.out.println("Соседи для end: " + end.getNeighbours());

    }
}

class Node{
    String title;
   private Map<Node, Integer> neighbours = new HashMap<>();

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
