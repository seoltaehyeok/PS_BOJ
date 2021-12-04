package io;

import java.util.Scanner;

public class APlusB {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = b%10;
		int d = (b%100)/10;
		int e = b/100;
		
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(a*e);
		System.out.println((a*c)+((a*d)*10+((a*e)*100)));
		
	}
}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
// 
//public class APlusB {
// 
//	public static void main(String[] args) throws IOException {
//        
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str," ");
//		double a = Integer.parseInt(st.nextToken());
//		double b = Integer.parseInt(st.nextToken());
//		
//
//		System.out.println(a/b);
//	}
//}