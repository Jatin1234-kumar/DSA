import java.util.*;

public class MaxSubarraySumK {

    static class Solution {
        public int maxSubarraySum(int[] arr, int k) {
            if (arr.length < k) {
                return 0;
            }

            int currWindowSum = 0;
            int maxSum;

            for (int i = 0; i < k; i++) {
                currWindowSum += arr[i];
            }

            maxSum = currWindowSum;

            for (int i = k; i < arr.length; i++) {
                currWindowSum += arr[i] - arr[i - k];
                maxSum = Math.max(currWindowSum, maxSum);
            }

            return maxSum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.maxSubarraySum(arr, k);

        System.out.println("Maximum subarray sum of size " + k + " is: " + result);

        sc.close();
    }
}