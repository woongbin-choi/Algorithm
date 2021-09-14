package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_10870 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(N));
	}
	
	public static int fibonacci(int a) {
		if(a == 0) return 0;
		else if(a == 1) return 1;
		else return fibonacci(a-1) + fibonacci(a-2);
	}
}
