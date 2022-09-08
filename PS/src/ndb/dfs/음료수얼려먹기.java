package ndb.dfs;

import java.util.Scanner;

// DFS 활용 방법
// 특정한 지점의 주변 상하좌우를 살펴본 뒤에 주변 지점이 0이면서 아직 방문하지 않은 지점이라면 해당 지점을 방문
// 방문한 지점에서 다시 상하좌우를 살펴본 뒤에 방문을 진행하면 연결된 모든 지점을 방문할 수 있음
// 모든 노드에 대해 위의 두 가지 과정을 반복하여 방문하지 않은 지점을 카운트
public class 음료수얼려먹기 {

	public static int n, m;
	public static int[][] graph = new int[1001][1001];

	// DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
	public static boolean dfs(int x, int y) {
		// 주어진 범위가 아니라면 즉시 종료
		if (x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}
		// 현재 노드를 아직 방문하지 않았다면
		if (graph[x][y] == 0) {
			graph[x][y] = 1;
			// 상하좌우를 재귀적으로 호출
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y - 1);
			dfs(x, y + 1);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// N * M 크기의 얼음 틀이 있다
		// 구멍이 뚫려 있는 부분 0, 칸막이가 존재하는 부분 1
		// 구멍이 뚫려 있는 부분끼리 상, 하, 좌, 우로 붙어 있는 경우 서로 연결되어 있는 것으로 간주
		// 얼음 틀의 모양이 주어졌을 때 생성되는 총 아이스크림의 개수를 구하라
		// 즉 상하좌우로 붙어있는 0끼리 1개의 아이스크림을 만들 수 있다.

		// 얼음 틀의 세로 길이 N과 가로 길이 M이 주어진다.

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		// nextInt의 경우 공백이나 Enter를 기준으로 그 앞의 정수를 가져오기 때문에 이후에 nextLine이 들어오면 이전 nextInt의
		// 공백이 출력된다.
		// 따라서 아래와 같이 nextLine으로 새로운 값을 출력하기 위해서는 버퍼 지우는 과정이 필요하다.
		scan.nextLine(); // 버퍼 지우기 => 이후에 문자열을 새로 입력받기 위해 이전의 버퍼를 지워준다.

		// 2차원 리스트의 맵 정보 입력 받기
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}

		// 모든 노드(위치)에 대하여 음료수 채우기
		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dfs(i, j)) {
					result += 1;
				}
			}
		}
        System.out.println(result); // 정답 출력 
	}
}
