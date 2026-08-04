import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length-1;
        int max=arr[n];
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]<max){
                return arr[i];
            }
        }
        return -1;
    }
}