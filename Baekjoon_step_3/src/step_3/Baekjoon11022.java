package step_3;

import java.io.*;
import java.util.*;

public class Baekjoon11022 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		
		StringTokenizer st;
		
		for (int i = 0; i < Integer.parseInt(s); i++) {
			st = new StringTokenizer(br.readLine());
			int a =	Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b)+ "\n");
		}
		
		bw.close();
	}

}
