package stack;

import java.util.Scanner;


public class Stack1 {
	public static int stack[];
	public static int size = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		stack = new int[n];
		
		
		for(int i=0; i<n; i++) {
			
			switch (scan.next()) {
			case "push":
				push(scan.nextInt());
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "top":
				sb.append(top()).append("\n");
				break;
			}
			
		}
		System.out.println(sb);
		scan.close();
	}

	public static void push(int x) {
		stack[size] = x;
		size++;
	}

	public static int pop() {
		if(size == 0)
			return -1;
		
		return stack[--size];
	}

	public static int size() {
		return size;
	}

	public static int empty() {
		if(size == 0)
			return 1;
		else
			return 0;
	}

	public static int top() {
		if (size == 0) {
			return -1;
		} else
			return stack[size-1];
	}
}
