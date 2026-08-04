import java.util.*;
class Solution {
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length;
        while(left<right-1){
            if((arr[left]+arr[right-1])==target){
                return true;
            }else if((arr[left]+arr[right-1])<target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}