package sort;

import java.util.Scanner;

public class Sort_2750_Bubble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				int temp;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
 			}
		}
		
		for(int i =0; i<N; i++) {
			System.out.println(arr[i]);
		}

	}

}
