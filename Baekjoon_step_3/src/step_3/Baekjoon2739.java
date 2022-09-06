package step_3;
import java.util.*;
public class Baekjoon2739 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			int answer = n * i;
			System.out.println(n + " * " + i + " = " + answer);
		}
	}

}
