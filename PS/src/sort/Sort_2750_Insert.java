package sort;

import java.util.Scanner;

public class Sort_2750_Insert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		// arr = {1, 2, 6, 4, 3}
		for (int i = 1; i < arr.length; i++) {

			int target = arr[i]; // target = 2 / target = 6 / target = 4 / target = 3
			int j = i - 1; // 0 / 1 / 2 / 3

			while (j >= 0 && arr[j] > target) { // 1 > 2 false / 2 > 6 false / 6 > 4 true / 2 > 4 false / 6 > 3 true / 4 > 3 true / 2 > 3 false
				arr[j+1] = arr[j];	// arr[3] = arr[2] => arr[3] = 6 / arr[4] = arr[3] => arr[4] = 6 / arr[3] = arr[2] => arr[3] = 4
				j--; // 1 // 2 // 1
			}
			arr[j + 1] = target; // 2 = 2 / 6 = 6 / arr[2] = 4 / arr[2] = 3
		}	// => {1,2,4,6,3} // {1,2,4,3,6} // {1,2,3,4,6}
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}

}
