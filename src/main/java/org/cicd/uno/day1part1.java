package org.cicd.uno;

import org.cicd.util.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class day1part1 {

    /*
    Sort both lists then iterate while adding diff list1[i] - list2[i]
     */
    static int unopart1(List<Integer> list1 , List<Integer> list2){
        Collections.sort(list1);
        Collections.sort(list2);
        return IntStream.range(0, list2.size())
                .map(i -> Math.abs(list2.get(i) - list1.get(i)))
                .sum();
    }

    public static void main(String... args) throws IOException {
        List<String> input = Util.readInput();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(String s : input){
            String[] numbers = s.split("\\s+");
            list1.add(Integer.parseInt(numbers[0]));
            list2.add(Integer.parseInt(numbers[1]));
        }
        System.out.println("Answer :"+ unopart1(list1,list2));
    }

}
