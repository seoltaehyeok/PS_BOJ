package ffor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class StarStamp{

	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}

}


//package ffor;
//
//import java.util.Scanner;
//
//public class StarStamp {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int a = input.nextInt();
//		
//		for(int i=1; i<=a; i++)
//		System.out.println(i);
//
//	}
//
//}
