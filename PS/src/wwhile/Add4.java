package wwhile;

import java.util.Scanner;

public class Add4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}
		in.close();
	}

}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
// 
//public class Add4 {
//	public static void main(String args[]) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		StringTokenizer st;
//		String str;
// 
//		while( (str=br.readLine()) != null ){
//		    
//			st = new StringTokenizer(str," ");
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			sb.append(a+b).append("\n");
//		
//		}
//		System.out.print(sb);
//	}
//}
