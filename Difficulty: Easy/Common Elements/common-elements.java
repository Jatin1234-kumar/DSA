import java.util.*;
class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        int n = a.length, m = b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j<m ){
            if(a[i]<b[j]){
                i++;
            } else if(a[i]==b[j]){
                arr.add(a[i]);
                i++;
                j++;
            } else{
                j++;
            }
        }
        return arr;
    }
}