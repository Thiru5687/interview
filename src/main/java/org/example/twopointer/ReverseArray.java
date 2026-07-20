package main.java.org.example.twopointer;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,12,23,45,67,87};
        getReversedArray(arr);
    }

    private static void getReversedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
