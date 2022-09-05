package ndb.recursion;

public class 유클리드호제법 {

	public static void main(String[] args) {
		
		System.out.println(gcd(192, 162));
	}
	
	public static int gcd(int a, int b) {
		
		if(a % b == 0) {
			return b;
		}
		else {
			return gcd(b, a%b);
		}
	}
}
