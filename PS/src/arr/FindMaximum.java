package arr;

import java.util.Scanner;

public class FindMaximum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[9];
		int max =0;
		for(int i=0; i<9; i++) {
			arr[i] = in.nextInt();
			if(max<arr[i])
				max = arr[i];
		}
		for(int i=0; i<9; i++){
			if(max == arr[i]) {
				System.out.println(arr[i]);
				System.out.println(i+1);
			}
		}

	}
}

