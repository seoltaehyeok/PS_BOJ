// //规过1
//package string;
//
//import java.util.Scanner;
//
//public class Constant {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int A = in.nextInt();
//		int B = in.nextInt();
//		
//		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
//		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
//		
//		System.out.println(A > B ? A : B);
//		
//	}
//
//}

// //规过2
//package string;
//import java.io.IOException;
//
//public class Constant {
// 
//	public static void main(String[] args) throws IOException {
//		int A = 0;
//		int B = 0;
//		
//		A += System.in.read() - 48;
//		A += (System.in.read() - 48)*10;
//		A += (System.in.read() - 48)*100;
//		
//		System.in.read();	// 傍归
//		
//		B += System.in.read() - 48;
//		B += (System.in.read() - 48)*10;
//		B += (System.in.read() - 48)*100;
//		
//		System.out.println(A > B ? A : B);
//	}
//}
package string;

import java.util.Scanner;

public class Constant {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2;
		int A[] = new int[3];
		int B[] = new int[3];
		int temp = 0;
		int one = in.nextInt();
		int two = in.nextInt();
		
		A[0] = one % 10;
		A[1] = (one / 10) % 10;
		A[2] = one / 100;
		B[0] = two % 10;
		B[1] = (two / 10) % 10;
		B[2] = two / 100;
		
		temp = A[2];
		A[2] = A[0];
		A[0] = temp;
		
		temp = B[2];
		B[2] = B[0];
		B[0] = temp;
		
		n1 = (A[2]*100 + A[1]*10 + A[0]);
		n2 = (B[2]*100 + B[1]*10 + B[0]);
		
		System.out.println(n1 > n2 ? n1 : n2);
	}
}