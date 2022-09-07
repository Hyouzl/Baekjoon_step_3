package step_3;

import java.io.*;
import java.util.*;


public class Baekjoon10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
			
			if (arr[i] < x) {
				bw.write(arr[i] + " ");
			}
			
		}
	
		bw.close();
	}

}
