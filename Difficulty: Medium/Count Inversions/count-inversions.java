import java.util.*;

class Solution {
    public int inversionCount(int arr[]) {
        if(arr.length <= 1){
            return 0;
        }

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        int leftCount = inversionCount(left);
        int rightCount = inversionCount(right);
        int mergeCount = count(arr, left, right);

        return leftCount + rightCount + mergeCount;
    }

    public int count(int[] arr, int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }
            else{
                arr[k] = right[j];
                j++;
                k++;

                count = count + (left.length - i);
            }
        }

        while(i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }

        return count;
    }
}