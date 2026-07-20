package main.java.org.example.twopointer;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,8,11,15,34};
        int k = 12;
        getMatchingSum(arr, k);
    }

    private static void getMatchingSum(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                System.out.println("Matching Pairs are:" + arr[left] + "," + arr[right]);
                left++;
                right--;
            } else if( sum < k){
                right++;
            } else {
                right--;
            }
        }
    }
}
