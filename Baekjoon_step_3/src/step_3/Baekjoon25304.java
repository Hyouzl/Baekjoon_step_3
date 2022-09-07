package step_3;

import java.util.*;

public class Baekjoon25304 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int money = scan.nextInt();
		
		int n = scan.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int k = a * b;
			
			sum += k;
		}
		
		if (money == sum) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}

}
