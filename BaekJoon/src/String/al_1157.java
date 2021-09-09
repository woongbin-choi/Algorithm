package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		String S = br.readLine();
		
		for (int i = 0; i < S.length(); ++i) {
			if ('a' <= S.charAt(i)&& S.charAt(i) <= 'z') arr[S.charAt(i) - 97]++;
			else arr[S.charAt(i) - 65]++;
		}
		
		int max = Integer.MIN_VALUE;
		char ch = '?';
		
		for (int i = 0; i < 26; ++i) {
			
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			} else if (arr[i] == max) ch = '?';
		}
		System.out.println(ch);
	}
}
