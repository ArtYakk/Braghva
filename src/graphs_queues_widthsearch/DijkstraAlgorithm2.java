package graphs_queues_widthsearch;

import java.util.HashMap;
import java.util.Map;

public class DijkstraAlgorithm2 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> graph= new HashMap<>();

        Map<String, Integer> start = new HashMap<>();
        Map<String, Integer> a = new HashMap<>();
        Map<String, Integer> b = new HashMap<>();
        Map<String, Integer> end = new HashMap<>();

        start.put("a", 6);
        start.put("b", 2);

        a.put("end", 1);

        b.put("a", 3);
        b.put("end", 5);

        graph.put("start", start);
        graph.put("a", a);
        graph.put("b", b);
        graph.put("end", end);

        System.out.println(start.keySet());
        System.out.println(start.get("a"));
        System.out.println(start.get("b"));

        Map<String, Integer> costs = new HashMap<>();
        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("end", Integer.MAX_VALUE);

        Map<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("end", null);

        String test = null;
        costs.entrySet().forEach(x -> {
            if(x.getValue() == 2){

            }
        });

    }

    public static String findLowestCost(Map<String, Integer> costs){
        Integer lowest = Integer.MAX_VALUE;
        String lowestName;
        costs.keySet().stream().map(a -> costs.get(a)).
    }
}
