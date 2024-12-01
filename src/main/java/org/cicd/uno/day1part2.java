package org.cicd.uno;

import org.cicd.util.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day1part2 {
    /*
This time, you'll need to figure out exactly how often each number from the left list appears in the right list. Calculate a total similarity score by adding up each number in the left list after multiplying it by the number of times that number appears in the right list.

Here are the same example lists again:

3   4
4   3
2   5
1   3
3   9
3   3
For these example lists, here is the process of finding the similarity score:

The first number in the left list is 3. It appears in the right list three times, so the similarity score increases by 3 * 3 = 9.
The second number in the left list is 4. It appears in the right list once, so the similarity score increases by 4 * 1 = 4.
The third number in the left list is 2. It does not appear in the right list, so the similarity score does not increase (2 * 0 = 0).
The fourth number, 1, also does not appear in the right list.
The fifth number, 3, appears in the right list three times; the similarity score increases by 9.
The last number, 3, appears in the right list three times; the similarity score again increases by 9.
So, for these example lists, the similarity score at the end of this process is 31 (9 + 4 + 0 + 0 + 9 + 9).

Most forward solution is to make a map of value and occurences from the second list then sum up the result of key*value
based on the first list;
     */
    static int unopart2(List<Integer> list1, List<Integer> list2) {
        Map<Integer, Integer> occurences = new HashMap<>();
        for (Integer num : list2) {
            occurences.put(num, occurences.getOrDefault(num, 0) + 1);
        }

        return list1.stream()
                .mapToInt(num -> num * occurences.getOrDefault(num, 0))
                .sum();
    }

    public static void main(String[] args) throws IOException {
        List<String> input = Util.readInput();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(String s: input){
            String[] numbers = s.split("\\s+");
            list1.add(Integer.parseInt(numbers[0]));
            list2.add(Integer.parseInt(numbers[1]));
        }
        System.out.println("Answer: " + unopart2(list1, list2));
    }
}
