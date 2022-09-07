package step_3;

import java.util.*;
import java.io.*;


public class Baekjoon15552 {
	
	public static void main(String[] args) {
		
			BufferedReader br = null;
			BufferedWriter bw = null;
			try {
			 br = new BufferedReader(new InputStreamReader(System.in));
			 bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;
			
			int t = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < t; i++) {
				st = new StringTokenizer(br.readLine());
				bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+ "\n"));
			}
			
			} catch (Exception e) {
				e.printStackTrace();
			} finally { try {bw.close();} catch (IOException e) {e.printStackTrace();} }
		
	}

}
