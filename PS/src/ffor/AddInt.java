package ffor;

import java.util.Scanner;

public class AddInt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt(); // test count
		int arr[] = new int[T]; // array size

		
		for(int i=0; i<T; i++) {
			int A = input.nextInt();
			int B = input.nextInt();
			arr[i] = A+B;
		}
		for(int i: arr)
			System.out.println(i);
	}

}
