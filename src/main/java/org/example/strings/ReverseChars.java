package main.java.org.example.strings;

import java.util.Arrays;

public class ReverseChars {
    public static void main(String[] args) {
        char[] chars = {'h','e','l','l','o'};
        getReverseChars(chars);
    }

    private static void getReverseChars(char[] chars) {
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(chars));
    }
}
