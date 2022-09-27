package ndb.sort;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {

	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	
	// 점수가 낮은 순서
	public int compareTo(Student std) {
		if (this.score < std.score) // ex. 95 -> 77 이니까 return 1을 통해 서로 바뀜 => 낮은 순 이순신 -> 홍길동순으로 출력
			return -1;
		return 1; // 1을 리턴할 시 두 객체의 위치가 서로 바뀐다.
	}
}

public class 성적이낮은순서로학생출력하기 {

	// N명의 학생 정보: (이름, 성적)
	// 성적이 낮은 순서대로 학생의 이름을 출력
	// 성적이 동일한 경우 자유롭게 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stdNum = scan.nextInt();

		// N명의 학생 정보 입력받아 리스트에 저장
		List<Student> students = new ArrayList();
		
		for(int i=0; i<stdNum; i++) {
			String name = scan.next();
			int score = scan.nextInt();
			students.add(new Student(name, score));
		}
		
		Collections.sort(students);
		
		for(int i = 0; i<stdNum; i++) {
			System.out.print(students.get(i).getName() + " ");
		}
		
	}
}
