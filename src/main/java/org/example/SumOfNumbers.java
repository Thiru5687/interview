package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers  = Arrays.asList(1,45,87,68,25);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Sum = " +sum);
        System.out.println("Average = " +avg);

        //count the number of strings which is greater than 3
        List<String> list  = Arrays.asList("welcome","Chennai","hai","to","Mumbai");
        long count = list.stream().filter(l-> l.length() > 3).count();
        System.out.println("No.of Strings > 3:"+count);

        //String with alphabetical order
        List<String> list1  = Arrays.asList("welcome","Chennai","hai","to","Mumbai");
        List<String> result = list1.stream().sorted().collect(Collectors.toList());
        System.out.println("Albhabatical Order: "+result);
    }
}
