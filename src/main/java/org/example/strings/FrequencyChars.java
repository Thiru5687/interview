package main.java.org.example.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyChars {
    public static void main(String[] args) {
        String str = "programminglanguage";
        getFrequencyChars(str);
    }

    private static void getFrequencyChars(String str) {
        Map<Character, Long> map = str.chars().mapToObj(c ->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

    }
}
