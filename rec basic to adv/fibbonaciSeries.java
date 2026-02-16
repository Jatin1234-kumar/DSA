public class fibbonaciSeries {
    int fibbonaci(int n){
        if(n<=1){
            return 1;
        }
       return n*fibbonaci(n-1);
    }
    public static void main(String[] args) {
        fibbonaciSeries f= new fibbonaciSeries();
        int result= f.fibbonaci(5);
        System.out.println(result);
    }    
}
