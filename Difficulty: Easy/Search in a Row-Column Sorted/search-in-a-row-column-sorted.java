class Solution {
    public static boolean matSearch(int a[][], int value) {
       int i = 0, j = a[0].length - 1; 

       while (i < a.length && j >= 0) {
           if (a[i][j] == value) {
               return true;
           } else if (a[i][j] > value) {
               j--; 
           } else {
               i++; 
           }
       }
  
       return false;
    }
}