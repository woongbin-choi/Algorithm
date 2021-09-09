package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_1316 {
	// 그룹 단어 체커 
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; ++i) {
			if (check()) cnt++;
		}
		
		System.out.println(cnt);
		
	}
	
	public static boolean check() throws IOException{
		boolean[] check = new boolean[26];
		int prev = 0;
		String S = br.readLine();
		
		for(int i = 0; i < S.length(); ++i) {
			int now = S.charAt(i);
			
			if(prev != now) {
				if(!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;
				}
				else return false;
			}
		}
		return true;
	}
}
