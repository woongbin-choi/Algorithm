package Array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class al_10818 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		int[] arr = new int[t];
		st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < t; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[t-1]);
	}
}
