package Array;

import java.io.*;
import java.util.StringTokenizer;

public class al_4344 {
	static String str;
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		int[] arr;
		
		for (int i = 0; i < t; ++i) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			
			double sum = 0;
			
			for(int j = 0; j < N; ++j) {
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum+= val;
				
			}
			
			double avg = (sum / N);
			double cnt = 0;
			
			for(int j = 0; j < N; ++j) {
				if(arr[j] > avg) cnt++;
			}
			
			System.out.printf("%.3f%%\n",(cnt/N)*100);
		}
		
		
	}
}
