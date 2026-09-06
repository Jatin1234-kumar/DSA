class Solution {
    public int countWays(int n) {
        // code here
        if(n<=2){
            return n;
        }
        
        return countWays(n-1)+countWays(n-2);
    }
}