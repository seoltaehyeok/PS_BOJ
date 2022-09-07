package ndb.recursion;
import java.util.*;
public class BFS예제 {

	public class Main {
		
		public static boolean[] visited = new boolean[9];
		public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		
		// BFS 함수 정의
		public static void bfs(int start) {
			Queue<Integer> q = new LinkedList<>();
			q.offer(start); // 초기 값 적재
			
			// 현재 노드를 방문 처리
			visited[start] = true;
			
			// 큐가 빌 때까지 반복
			while(!q.isEmpty()) {
				// 큐에서 하나의 원소를 뽑아서 출력
				int x = q.poll();
				System.out.print(x + " ");
				// 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
				for(int i =0; i<graph.get(x).size(); i++) {
					int y = graph.get(x).get(i);
					if(!visited[y]) {
						q.offer(y);	// 큐에 원소를 삽입하여 while반복문이 끝나지 않음
// 방문하지 않은 원소를 큐에 삽입하면 for문이 끝나고 해당 큐 원소를 while문에서 poll()을 통해 뽑아내서 반복할 수 있음
						visited[y] = true; 
					}
				}
			}
		}

	    public static void main(String[] args) {
	        

	        // 노드 1에 연결된 노드 정보 저장 
	        graph.get(1).add(2);
	        graph.get(1).add(3);
	        graph.get(1).add(8);
	        
	        // 노드 2에 연결된 노드 정보 저장 
	        graph.get(2).add(1);
	        graph.get(2).add(7);
	        
	        // 노드 3에 연결된 노드 정보 저장 
	        graph.get(3).add(1);
	        graph.get(3).add(4);
	        graph.get(3).add(5);
	        
	        // 노드 4에 연결된 노드 정보 저장 
	        graph.get(4).add(3);
	        graph.get(4).add(5);
	        
	        // 노드 5에 연결된 노드 정보 저장 
	        graph.get(5).add(3);
	        graph.get(5).add(4);
	        
	        // 노드 6에 연결된 노드 정보 저장 
	        graph.get(6).add(7);
	        
	        // 노드 7에 연결된 노드 정보 저장 
	        graph.get(7).add(2);
	        graph.get(7).add(6);
	        graph.get(7).add(8);
	        
	        // 노드 8에 연결된 노드 정보 저장 
	        graph.get(8).add(1);
	        graph.get(8).add(7);

	        bfs(1);
	    }

	}
}
