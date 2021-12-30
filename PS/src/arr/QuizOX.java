package arr;

import java.util.Scanner;

public class QuizOX {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String arr[] = new String[in.nextInt()];
		

		
		for(int i=0; i< arr.length; i++){
			arr[i] = in.next();
		}
		
		for(int i=0; i<arr.length; i++) {
			
			int count = 0;
			int sum = 0;
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
					sum+=count;
				} else
					count=0;
			}
			System.out.println(sum);
		}
		
	}

}
