package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_2941 {
	// 크로아티아 알파벳의 개수를 세는 문제
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		int len = S.length();
		int cnt = 0;
		
		for (int i = 0; i < len; ++i) {
			char ch = S.charAt(i);
			
			if(ch == 'c' && i < len-1) {
				if(S.charAt(i+1) == '=' || S.charAt(i+1) == '-') i++;
			}
			
			else if (ch == 'd' && i < len-1) {
				if(S.charAt(i+1) == '-') i++;
				else if(S.charAt(i+1) == 'z' && i < len -2) {
					if(S.charAt(i+2) == '=') i += 2;
				}
			}
			else if ((ch == 'l' || ch == 'n') && i < len-1) {
				if(S.charAt(i+1) == 'j') i++;
			}
			
			else if((ch == 's' || ch =='z') && i < len-1) {
				if(S.charAt(i+1) == '=') i++;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
