package sort;

import java.util.Scanner;

public class Sort_2750_Select {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		int minIndex = 0;
		int temp;
		
		for(int i =0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<arr.length-1; i++) {
			minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}

		
	}
}
