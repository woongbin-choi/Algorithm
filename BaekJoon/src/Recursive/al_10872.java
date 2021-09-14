package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = factorial(N);
		
		System.out.println(sum);
	}
	
	public static int factorial(int a) {
		if(a <= 1) return 1;
		return a * factorial(a-1);
		
		
	}
}

