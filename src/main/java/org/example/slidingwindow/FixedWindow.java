package main.java.org.example.slidingwindow;

import java.awt.*;

public class FixedWindow {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9,11,15};
        int k = 3;
        System.out.println(maxSum(arr, k));
    }

    private static int maxSum(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;
        //1st window index 0 to 2
        for(int i = 0; i < k; i++){
            windowSum += arr[i];//1+3+5 = 9
        }
        maxSum = windowSum;
        for(int end = k; end < arr.length; end++){
            windowSum += arr[end] - arr[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
