package main.java.org.example.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateWords {
    public static void main(String[] args) {
        String str = "Welcome to My Home to my Buddy";
        getDuplicateWords(str);
        getDuplicateWordsbyJava8(str);
    }

    private static void getDuplicateWordsbyJava8(String str) {
        Map<String, Long> wordCount = Arrays.stream(str.split("\\s+"))
                .map(String::toLowerCase)
        .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println("Duplicate Words and Counts using Java 8: ");
        wordCount.entrySet().stream()
                .filter(w -> w.getValue() > 1)
                .forEach(w-> System.out.println(w.getKey() + "-> "+ w.getValue()));
    }

    private static void getDuplicateWords(String str) {
        String[] words = str.split(" ");
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for(String w:words) {
            w = w.toLowerCase();
            wordCounts.put(w, wordCounts.getOrDefault(w, 0) + 1);
        }
            System.out.println("Duplicate Words and their counts: ");
            for(Map.Entry<String, Integer> entry : wordCounts.entrySet()){
                if(entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }
        }
}
