package step_3;


import java.io.*;
import java.util.*;

public class Baekjoon10952 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		String str = null;
		
		while (true) {
			str = br.readLine();
			st = new StringTokenizer(str);
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if (x == 0 && y == 0) {
				break;
			}
	
			else {
				bw.write(x + y + "\n");
			}
		}
	
		bw.close();
	}

}
