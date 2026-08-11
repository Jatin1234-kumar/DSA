class Solution {
    public boolean isSorted(int[] arr) {
        for(int t = 0; t < arr.length - 1; t++) {
            if(arr[t] > arr[t + 1]) {
                return false;
            }
        }
        return true;
    }
}