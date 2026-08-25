class Solution {
    boolean isPalindrome(String s) {
        int i=0;
        int n=s.length()-1;
        while(i<=n){
            if(s.charAt(i)==s.charAt(n)){
                i++;n--;
            }else{
                return false;
            }
        }
        return true;
    }
}