package StandardMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class al_2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		TreeSet<Integer> tm = new TreeSet<>();
		
		for(int i = M; i <= N; ++i) {
			if(isPrime(i)) tm.add(i);
		}
		int sum = 0;
		for(int x : tm) {
			sum += x;
		}
		
		if(tm.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(tm.first());
		}
	}
	
	public static boolean isPrime(int a) {
		
		if(a < 2) return false;
		
		for(int i = 2; i < a; ++i) {
			if(a % i == 0) return false;
		}
		
		return true;
	}
}
