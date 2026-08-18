class Solution {
    public boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
                     int mid = low + (high - low) / 2;

                     if (arr[mid] == target) {
                         return true;
                     } else if (arr[mid] < target) {
                         low = mid + 1;
                     } else {
                         high = mid - 1;
                     }
    }
        return false;
    }
}