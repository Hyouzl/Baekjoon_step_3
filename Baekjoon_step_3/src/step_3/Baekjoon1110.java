package step_3;

import java.util.*;

public class Baekjoon1110 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num = n;
		int newNum = 100;
		int sum = 0;
		int right = 0;
		int left = 0;
		int cnt = 0;
	
		 
		while (newNum != n) {
			
			cnt++;
		
			for (int i = 0; i < 2; i++) {
				left = num / 10;
				right = num % 10;
			
				sum = left + right;
			}
	
		
			if (sum < 10) {
				newNum = (right * 10) + sum;
			}	
			else {
				newNum = (right * 10) + (sum % 10);
			}
			
			num = newNum;
			
		}
		
		System.out.println(cnt);

	}

}
