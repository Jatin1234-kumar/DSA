import java.util.*;

public class TripletClosestSum {

    static long closestSum(int n, int target, long arr[]) {

        Arrays.sort(arr);
        long closest = Long.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                long currSum = arr[i] + arr[left] + arr[right];

                if (Math.abs(target - currSum) < Math.abs(target - closest)) {
                    closest = currSum;
                }

                if (currSum < target) {
                    left++;
                } else if (currSum > target) {
                    right--;
                } else {
                    return currSum; 
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        int target = sc.nextInt();

        System.out.println(closestSum(n, target, arr));

        sc.close();
    }
}