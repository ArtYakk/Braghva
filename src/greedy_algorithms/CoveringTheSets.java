package greedy_algorithms;

import java.util.*;

public class CoveringTheSets {
    public static void main(String[] args) {
        Set<String> statesNeeded = new HashSet<>(List.of("mt", "wa", "or", "id", "nv", "ut", "са", "az")); // Штаты которые нужно покрыть

        Map<String, Set<String>> stations = new HashMap<>(); // Станции (имя, покрываемые штаты)
        stations.put("kone", Set.of("id", "nv", "up"));
        stations.put("ktwo", Set.of("wa", "id", "mt"));
        stations.put("kthree", Set.of("or", "nv", "ca"));
        stations.put("kfour", Set.of("nv", "ut"));
        stations.put("kfive", Set.of("ca", "az"));

        Set<String> finalStations = new HashSet<>(); // Тут лежат финальные станции

        String bestStation = ""; // Тут станция покрывающая больше всего штатов, не входящих в текущее покрытие
        Set<String> statesCovered = new HashSet<>(); // Тут штаты этой станции, не входящие в текущее покрытие


    }
}
