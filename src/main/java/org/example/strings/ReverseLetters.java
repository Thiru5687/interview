package main.java.org.example.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseLetters {
    public static void main(String[] args) {
        String s = "Welcome";
        System.out.println("Using reduce(): " + getReverse(s));
        System.out.println("Using recursion: " + getReverseLetter(s));
        System.out.println("Using String Builder: " + getReverseSB(s));
        System.out.println("Using intStream: " + getReverseIntStream(s));
    }

    private static String getReverseIntStream(String s) {
        return IntStream.range(0, s.length()).mapToObj(i -> String.valueOf(s.charAt(s.length() - 1 - i)))
                .collect(Collectors.joining());
    }

    private static String getReverseSB(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    //Using reduce() method
    private static String getReverse(String s) {
        return Stream.of(s.split("")).reduce("",(a, b) -> b + a);
    }

    private static String getReverseLetter(String str){
        if(str.isEmpty()) {
            return str;
        }
        return getReverseLetter(str.substring(1)) + str.charAt(0);
    }
}
