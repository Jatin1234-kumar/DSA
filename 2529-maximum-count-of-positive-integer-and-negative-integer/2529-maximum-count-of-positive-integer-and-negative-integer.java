import java.util.*;

class Solution {
    public int maximumCount(int[] arr) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= 0) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        int pos = arr.length - low;

        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < 0) {
                int neg = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        int neg = high + 1;

        return Math.max(pos, neg);
    }
}