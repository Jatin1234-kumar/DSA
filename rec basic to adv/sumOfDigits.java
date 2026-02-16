public class sumOfDigits {
   int sumofdigits(int n){
       if(n%10==n){
           return n;
       } else{
           return n%10+sumofdigits(n/10);
       }
   }
	public static void main(String[] args) {
	    sumOfDigits m= new sumOfDigits();
		int ans = m.sumofdigits(12356);
		System.out.println(ans);
	}
}

