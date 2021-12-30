package arr;

import java.util.Arrays;
import java.util.Scanner;

public class Avrage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int arr[] = new int[A];
		double avg=0;
		for(int i=0; i<A; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int m = arr[A-1];
		

		for(int i=0; i<A; i++) {
		avg+=(double) arr[i]/m *100;
	}
		System.out.println(avg/A);
	}
}
