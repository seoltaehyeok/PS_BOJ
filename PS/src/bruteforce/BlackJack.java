package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BlackJack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 각 카드는 양의 정수
		// 딜러는 N장의 카드 모두 숫자가 보이도록 바닥에 놓는다.
		// 딜러는 숫자 M을 외친다.
		// player N장의 카드 중 3장의 카드 고르기
		// M을 넘지 않으면서 M과 가장 가까운 수
		// N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 가까운 수 3장의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cardNum = Integer.parseInt(st.nextToken());
		int cardM = Integer.parseInt(st.nextToken());
//		int cardNum = Integer.parseInt(st.nextToken()); // 3 <= cardNum <= 100
//		int cardM =  Integer.parseInt(st.nextToken()); // 10 <= cardM <= 300000
		int[] card = new int[cardNum];
		st = new StringTokenizer(br.readLine());
		// n만큼 카드 뽑기
		for (int i = 0; i < card.length; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
//		// 배열 정렬하기
//		for (int i = 0; i < card.length - 1; i++) {
//			for (int j = i; j < card.length; j++) {
//				if (card[i] > card[j]) {
//					temp = card[i];
//					card[i] = card[j];
//					card[j] = temp;
//				}
//			}
//		}
		int[] sum = new int[1000000];
		int count = 0;
		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < card.length; j++) {
				for (int k = 0; k < card.length; k++) {
					if (i == j || j == k || i == k) {
						continue;
					}
					sum[count] = (card[i] + card[j] + card[k]);
					count++;
				}
			}
		}
		int temp2;
		int cnt = 0;
		for(int i=0; i<count-1; i++) {
			for(int j=i; j<count; j++) {
				if(sum[i] > sum[j]) {
					temp2 = sum[i];
					sum[i] = sum[j];
					sum[j] = temp2;
				}
			}
		}
		for(int i=0; i<count; i++) {
			if(sum[i] > cardM)
				break;
			cnt++;
		}
		System.out.println(sum[cnt-1]);
	}
}

