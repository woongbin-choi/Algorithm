package StandardMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class al_1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int cnt = 0;
		
		for(int i = 0; i < T; ++i) {
			if(isPrime(Integer.parseInt(st.nextToken()))){
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	
	public static boolean isPrime(int a) {
		if(a < 2) return false;
		
		for(int i = 2; i < a; ++i) {
			if(a % i == 0) return false;
		}
		return true;
	}
}
