package StandardMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_2839 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		while(N % 5 != 0) {
			N -= 3;
			cnt++;
		}
		if (N < 0) System.out.println(-1);
		else {
			cnt += N / 5;
			System.out.println(cnt);
		}
		br.close();
	}

}
