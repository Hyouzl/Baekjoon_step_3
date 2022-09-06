package step_3;
import java.util.*;
public class Baekjoon10950 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		int a,b;
		
		int[] answer = new int[testCase]; 
		for (int i = 0; i < testCase; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			answer[i] = a + b;
		}
		
		for (int i = 0; i < testCase; i++) {
			System.out.println(answer[i]);
		}
	}
}
