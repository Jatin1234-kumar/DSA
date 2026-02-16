public class revOfNum {
    int rev = 0;   

    int reverse(int n){
        if(n == 0){
            return rev;
        }

        rev = rev * 10 + n % 10;
        return reverse(n / 10);
    }

    public static void main(String[] args) {
        revOfNum m = new revOfNum();
        int ans = m.reverse(12356);
        System.out.println(ans);
    }
}
