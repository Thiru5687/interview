package main.java.org.example.strings;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = IntStream.range(0, str.length()/2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - 1 -i));
        System.out.println(isPalindrome);
    }
}
