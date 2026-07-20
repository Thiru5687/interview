package org.example.strings;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = IntStream.range(0, str.length()/2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - 1 -i));
        System.out.println(isPalindrome);
        System.out.println("madam is palindrome?: " +isPalindrome2(str));
    }

    private static boolean isPalindrome2(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
