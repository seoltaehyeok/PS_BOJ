package arr;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[42];
		int result=0;
		int count=0;
		for(int i=0; i<10; i++) {
			result = in.nextInt()%42;
			arr[result] += 1;
			
		}
		for(int i=0; i<42; i++) {
			if(arr[i]>=1) {
				count++;
			}
		}
		System.out.println(count);
 }
}
//	Scanner in = new Scanner(System.in);
//	int arr[] = new int[10];
//	int rs[] = new int[42];
//	int result=0;
//	int count=0;
//	
//	for(int i=0; i<10; i++) {
//		arr[i] = in.nextInt();
//		result = arr[i]%42;
//		rs[result] +=1;
//	}
//	for(int i=0; i<42; i++) {
//		System.out.println(rs[i]);
//	}
//}
