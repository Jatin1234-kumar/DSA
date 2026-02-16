public class Main
{
void print(int n){
    if(n==0){
        return;
    }
	System.out.println(n);
	print(n-1);
}
	public static void main(String[] args) {
	    Main m= new Main();
		m.print(10);
	}
}