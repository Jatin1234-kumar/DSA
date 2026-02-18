public class zeroCount {
    void countZero(int n, int count) {

        if(n % 10 == 0){
            count = count + 1;
        }

        if(n % 10 == n && n != 0){
            System.out.println(count);   // print only at final digit
            return;
        }

        countZero(n / 10, count);
    }

    public static void main(String[] args) {
        zeroCount m = new zeroCount();
        m.countZero(350860, 0);
    }
}
