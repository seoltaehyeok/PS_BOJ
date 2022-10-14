package ndb.dynamicProgramming;

import java.util.Scanner;

public class 일로만들기 {
	// 해당 x값의 최적의 해를 구하기 위해서 직전 값의 최적의 해를 구해둔 뒤
	// 직전 값의 최적의 해에다가 + 1을 해주면 된다.
	// 하지만 각각의 경우(a,b,c,d 연산)가 다 다르므로 해당 최적의 해를 모두 구한 뒤
	// 해당 최적의 해 중에서 가장 최소로 연산하는 최적의 해를 찾는다.
	public static int d[] = new int[30000];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		// d[i]의 값에는 해당 값의 optimal solution이(최적 해) 들어간다.
		for (int i = 2; i <= x; i++) {
			// 현재의 수에서 1을 빼는 경우
			// 직전 값의 최적의 해 + 1 (직전 값의 최적의 해에다가 1을 빼는 연산을 했으므로 +1을 해준다)
			d[i] = d[i - 1] + 1; 
			// 현재의 수가 2로 나누어 떨어지는 경우
			if (d[i] % 2 == 0) {
				d[i] = Math.min(d[i], d[i/2] + 1);
			}
			// 현재의 수가 3으로 나누어 떨어지는 경우
			if (d[i] % 3 == 0) {
				d[i] = Math.min(d[i],d[i/3] + 1);
			}
			// 현재의 수가 5로 나누어 떨어지는 경우
			if (d[i] % 5 == 0) {
				d[i] = Math.min(d[i], d[i/5] + 1);
			}
		}
		System.out.println(d[x]);
	}
}


// x=6이라고 가정하고, 23라인부터 해설
// d[2] = d[1] + 1 => 0 + 1 = 1
// d[3] = d[2] + 1 => 1 + 1 = 2 	
// => i가 3이 나왔으니 28라인-> d[3] = min(d[3], d[3/3] + 1)
// => min(2, 0+1) = 1	d[3] = 1
// d[4] = d[3] + 1 = 1 + 1 = 2 i가 4니까 25라인으로
// d[4] = min(d[4], d[4/2] + 1) = min(2, 1+1) = 2
// d[5] = d[4] + 1 = 3 i가 5이므로 31라인으로
// d[5] = min(d[5], d[5/5] + 1) => min(3, 0+1) => 1
// d[6] = d[5] + 1 = 2 i가 6이므로 25라인으로
// d[6] = min(d[6], d[6/2] + 1) = min(2, 2) => 2
// 만일 d[6]을 28라인으로 이동하면?
// d[6] = min(d[6], d[6/3] +1) = min(2, 2) => 2
