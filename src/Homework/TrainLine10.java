package Homework;
/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

import java.util.*;

public class TrainLine10 {
    public static void main(String[] args) {
        TrainLine10 trainLine10 = new TrainLine10();
        trainLine10.trainLines();
    }

    private void trainLines() {
        Map<String, List<String>> stationMap = new HashMap<>();

        List<String> liverpoolList = new ArrayList<>();
        liverpoolList.add("Central");
        liverpoolList.add("Circle");
        liverpoolList.add("Hammersmith & City");
        liverpoolList.add("Metropolitan lines");
        stationMap.put("Liverpool Street", liverpoolList);

        List<String> bankList = new ArrayList<>();
        bankList.add("Central");
        bankList.add("Circle");
        bankList.add("Hammersmith & City");
        stationMap.put("Bank", bankList);

        System.out.println("Enter station name : ");
        Scanner scanner = new Scanner(System.in);
        String stationName = scanner.next();

        System.out.println("Below lines are passes through " + stationName) ;
        List<String> lineList = stationMap.get(stationName);
        for (String line : lineList) {
            System.out.println(line);
        }

    }
}


