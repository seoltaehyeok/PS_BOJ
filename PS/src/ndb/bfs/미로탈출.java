package ndb.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// bfs는 시작 지점에서 가까운 노드부터 차례대로 그래프의 모든 노드를 탐색함
// (1,1) 지점에서부터 bfs를 수행함여 모든 노드의 값을 거리 정보로 넣으면 된다.
// 특정 노드에 방문하면 그 이전 노드의 거리에 +1 을 한 값을 리스트에 넣는다.
class Node {

	private int x;
	private int y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}

public class 미로탈출 {

	public static int[][] graph = new int[201][201];
	public static int n;
	public static int m;

	// 이동할 네 가지 방향 정의 (상, 하, 좌, 우)
	public static int dx[] = { -1, 1, 0, 0 };
	public static int dy[] = { 0, 0, -1, 1 };

	public static int bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y));

		while (!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();

			for (int i = 0; i < 4; i++) {
				// 현재위치에서 상하좌우 좌표값을 nx, ny에 담는다.
				int nx = x + dx[i];
				int ny = y + dy[i];

				
				// 상하좌우의 좌표값을 할당받았는데 그 값이 미로에서 벗어난 좌표라면 무시하고 계속 수행한다.
				if (nx < 0 || nx >= n || ny < 0 || ny >= m)
					continue;
				// 그 값이 괴물을 만나는 좌표값이라면 무시하고 계속 수행한다.
				if (graph[nx][ny] == 0)
					continue;

				// 미로의 탈출구라면 기존 노드의 거리 값에서 + 1을 한다.
				// 해당 nx,ny좌표값을 큐에 새로 넣는다.
				if (graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					q.offer(new Node(nx, ny));
				}
			}

		}
		// 출구 좌표 (N,M)의 위치의 최단경로값을 리턴한다.
		return graph[n - 1][m - 1];

	}

	public static void main(String[] args) {
		// N*M 크기의 직사각형 형태의 미로에 갇혀 있다.
		// 현재 위치는 (1,1)이고 미로의 출구는 (N,M)의 위치에 존재하며 한 번에 한 칸씩 이동할 수 있다.
		// 괴물이 있는 부분은 0으로, 괴물이 없는 부분은 1로 표시되어 있다.
		// 미로는 반드시 탈출할 수 있는 형태로 제시된다.
		// 탈출하기 위한 최소 칸의 개수를 구하라

		// 첫째 줄에 최소 이동 칸의 개수를 출력
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		
		System.out.println(bfs(0, 0));
	}
}
