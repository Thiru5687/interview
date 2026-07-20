package main.java.org.example.twopointer;

public class MostWater {
    public static void main(String[] args) {
        int[] height = {3,6,8,10,15,23,45};
        System.out.println(getMaxWater(height));
    }

    private static int getMaxWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);

            if(height[left] < height[right])
                left++;
            else
              right--;
        }
        return max;
    }
}
