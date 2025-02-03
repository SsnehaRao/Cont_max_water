import java.util.Scanner;
import java.util.Arrays; 

public class Cont_with_most_water{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] height = new int[n];

        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.maxArea(height);

        System.out.println("Maximum water area: " + result);

        scanner.close();
    }
}

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;

        
    }
}