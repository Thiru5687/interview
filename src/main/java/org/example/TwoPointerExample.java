package main.java.org.example;

import java.util.Arrays;
import java.util.List;

public class TwoPointerExample {
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 6, 7, 18, 12, 26, 17, 3};
        int target = 20;

        getTargetIndices(arr, target);
    }

    static void getTargetIndices(int[] a, int tar) {
        Arrays.sort(a);
        int left = 0;
        int right = a.length - 1;
        boolean found = false;
        System.out.println("Matching pairs for target: "+tar);
        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == tar) {
                System.out.println("[" + a[left] + "," + a[right] + "]");
                found = true;
                left++;
                right--;
            }
            else if(sum < tar){
                left++;
            }
            else {
                right --;
            }
        }
        if(!found){
            System.out.println("No matching found!");
        }
    }
}