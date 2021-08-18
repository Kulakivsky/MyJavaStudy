package ua.myjavastudy.lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,7,5,2,0,19,0,32,14,123,654,0,2,5,2,6,1,7,0,-1);

        //first task: find average;
        IntStream intStream = list.stream().mapToInt(x -> x);
        double average = intStream.average().getAsDouble();
        System.out.println(average);

        //second task: find min element, value and index;
        IntStream intStream2 = list.stream().mapToInt(x -> x);
        int min = intStream2.min().getAsInt();
        System.out.println("value of min element:" + min + " ");
        System.out.println("index of min element:" + list.indexOf(min));


        // third task: count number of elements that`s equal 0;
        IntStream intStream3 = list.stream().mapToInt(x -> x);
        int count = (int) intStream3.filter(x -> x == 0).count();
        System.out.println(count);

        // task four: find number of elements that`s more than 0;
        IntStream intStream4 = list.stream().mapToInt(x -> x);
        int elMoreThanZero = (int) intStream4.filter(x -> x > 0).count();
        System.out.println(elMoreThanZero);

        // task five: multiply each element;
        IntStream intStream5 = list.stream().mapToInt(x -> x);
        intStream5.map(x -> x*15).forEach(result -> System.out.print(result + " "));
    }
}
