package arr;

import java.util.Scanner;

public class MoreThanAverage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int C = in.nextInt();

		for(int i=0; i<C; i++) { // test case
			int N = in.nextInt();
			int arr[] = new int[N];
			int sum=0;
			double count=0;
			
			for(int j=0; j<N; j++) { // student number
				arr[j] = in.nextInt();
				sum += arr[j];
			}
			double avg = (double)sum/N;
			
			for(int k=0; k<N; k++) {
				if(arr[k]>avg)
					count++;
			}
			System.out.println(String.format("%.3f",(count/(double)N)*100)+"%");
		}
	}

}
