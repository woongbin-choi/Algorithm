package Array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class al_1546 {
	static double num;
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine()," ");
		
		double[] arr = new double[t];
		
		int max = 0;
		
		for(int i = 0; i < t; ++i) {
			double num = Double.parseDouble(st.nextToken());
			arr[i] = num;
		}
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; ++i) {
			
			sum += ((arr[i] / arr[arr.length-1])*100);
		}
		System.out.println(sum/arr.length);
	}
}
