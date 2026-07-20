package main.java.org.example.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurence {
    public static void main(String[] args) {
        String str = "welcome to chennai";
        Map<Character, Long> map = str.chars().mapToObj(c ->(char) c)
                .filter(ch -> ch != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

    }
}
