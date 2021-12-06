package ffor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CaseAdd2 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int Case = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=1; i<=Case; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int sum = A+B;
			bw.write("Case #"+i+": "+A+" + "+B+" = " +sum+"\n");
		}
		bw.flush();
		bw.close();
	}

}
