package main.java.org.example.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyWords {
    public static void main(String[] args) {
        String s = "Weclome to My World Akkiya Welcome to Chennai My house";
        getFrequencyWords(s);
    }

    private static void getFrequencyWords(String s) {
        Map<String, Long> map = Arrays.stream(s.split(" "))
                .collect(
                    Collectors.groupingBy(Function.identity(),
                    Collectors.counting()));
        System.out.println(map);
    }
}
