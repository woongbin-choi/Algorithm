package Array;

import java.io.*;

public class al_2562 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		for(int i=0; i <9; ++i) {
			int input = Integer.parseInt(br.readLine());
			arr[i] = input;
		}
		int check = 0;
		int max = arr[0];
		for(int i = 1; i < arr.length; ++i) {
			if(arr[i] > max) {
				max = arr[i];
				check = i;
			} 
		}
		System.out.println(max);
		System.out.println(check+1);
	}
}
