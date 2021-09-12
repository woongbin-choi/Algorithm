package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class al_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int first = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
		
		int res1 = 0, res2 = 0;
		int t = 0;
		while(first > 0) {
			t = first % 10;
			res1 = res1 * 10 + t;
			first /= 10;
		}
		
		int m = 0;
		while(second > 0) {
			m = second % 10;
			res2 = res2 * 10 + m;
			second /= 10;
		}
		
		System.out.println(Math.max(res1, res2));
	}
}
