package ffor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CaseAdd {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int Case = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=1; i<=Case; i++) {
			st = new StringTokenizer(br.readLine());
			int sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+sum+"\n");
		}
		bw.flush();
		bw.close();
	}

}
