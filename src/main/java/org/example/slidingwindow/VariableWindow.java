package main.java.org.example.slidingwindow;

import java.util.HashSet;

public class VariableWindow {
    public static void main(String[] args) {
        String str = "abcabbcabb";
        System.out.println("Longest subsring length is: "+findLongestLengthSubString(str));
    }

    private static int findLongestLengthSubString(String str) {
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int right = 0; right < str.length(); right++ ){
            while (hs.contains(str.charAt(right))) {
                hs.remove(str.charAt(left));
                left++;
            }
            hs.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left +1);
            }
        return maxLength;
        }

    }
