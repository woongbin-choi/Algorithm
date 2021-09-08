package Array;

import java.io.*;
import java.util.HashSet;

public class al_3052 {
	static int num;
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}
		
		HashSet<Integer> rrr = new HashSet<>();
		
		for (int i = 0; i < arr.length; ++i) {
			rrr.add(arr[i] % 42);
		}
		System.out.println(rrr.size());
	}
}
