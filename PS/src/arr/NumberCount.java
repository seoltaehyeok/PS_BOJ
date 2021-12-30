package arr;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int ABC = A*B*C;
		int[] arr = new int[10];
		int result=0;
		for(int i=0; ABC>0; i++) {
			result = ABC % 10;
			arr[result] += 1;
			ABC = ABC / 10;
		}
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}

	}

}
