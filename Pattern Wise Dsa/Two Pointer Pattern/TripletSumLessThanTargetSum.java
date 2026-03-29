import java.util.*;

public class TripletSumLessThanTargetSum {

    static long countTriplets(int n, int sum, long arr[]) {

        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                long currSum = arr[i] + arr[left] + arr[right];

                if (currSum < sum) {
                    count += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        int sum = sc.nextInt();

        long result = countTriplets(n, sum, arr);

        System.out.println(result);

        sc.close();
    }
}