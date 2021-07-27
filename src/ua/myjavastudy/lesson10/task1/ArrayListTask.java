package ua.myjavastudy.lesson10.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayListTask {

    public static void main(String[] args) {

        ArrayList<Integer> uniqueValue = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            uniqueValue.add(sc.nextInt());
        }

        Integer temp;

        Map<Integer, Integer> mapValues = new HashMap<>();

        for (int i = 0; i < uniqueValue.size(); i++) {
            temp = uniqueValue.get(i);
            if (mapValues.containsKey(temp)) {
                mapValues.replace(temp, mapValues.get(temp)+1);
            } else {
                mapValues.put(temp, 1);
            }
        }

        System.out.println(mapValues);


    }

}
