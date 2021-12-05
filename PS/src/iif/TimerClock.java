package iif;

import java.util.Scanner;

public class TimerClock {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int m = input.nextInt();
		
		if(m<45) {
			m += 60;
			h--;
			if(h<0) 
				h = 23;
		}
		System.out.print(h + " ");
		System.out.println(m-45);

	}

}
