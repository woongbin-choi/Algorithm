package Array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class al_8958 {
	static String str;
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		String[] sarr = new String[t];
		for (int i = 0; i < t; ++i) {
			st = new StringTokenizer(br.readLine());
			sarr[i] = st.nextToken();
		}
		
		
		for (int i = 0; i < sarr.length; ++i) {
			
			int cnt = 0;
			int sum = 0;
			
			for (int j = 0; j < sarr[i].length(); ++j) {
				if (sarr[i].charAt(j) == 'O') cnt++;
				else cnt = 0;
				
				sum += cnt;
			}
			
			
			System.out.println(sum);
		}
		
	}
}
