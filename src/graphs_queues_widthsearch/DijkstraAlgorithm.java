package graphs_queues_widthsearch;

import java.util.*;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> graph = new HashMap<>(); // Nodes with neighbours are here

        Map<String, Integer> start = new HashMap<>();
        Map<String, Integer> a = new HashMap<>();
        Map<String, Integer> b = new HashMap<>();
        Map<String, Integer> fin = new HashMap<>();

        start.put("a", 6);
        start.put("b", 2);

        a.put("fin", 1);

        b.put("a", 3);
        b.put("fin", 5);

        graph.put("start", start);
        graph.put("a", a);
        graph.put("b", b);
        graph.put("fin", fin);

        Map<String, Integer> costs = new HashMap<>();
        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("fin", Integer.MAX_VALUE);

        Map<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);

        Set<String> processed = new HashSet<>();

        String node = findLowestCost(costs, processed);
        while (node != null){
            Integer cost = costs.get(node);
            Map<String, Integer> neighbours = graph.get(node);
            for (String n : neighbours.keySet()) {
                Integer newCost = cost + neighbours.get(n);
                if(costs.get(n) > newCost){
                    costs.put(n, newCost);
                    parents.put(n, node);
                }
            }
            processed.add(node);
            node = findLowestCost(costs, processed);
        }

        System.out.println(costs + "\n" + parents);
    }

    public static String findLowestCost(Map<String, Integer> costs, Set<String> processed){
       Map.Entry<String, Integer> lowest =
                 costs
                .entrySet()
                .stream()
                .filter(e -> !processed.contains(e.getKey()))
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .orElse(null);

        if(lowest != null){
            return lowest.getKey();
        } else return null;
    }

}
