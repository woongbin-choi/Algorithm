package While;

import java.io.*;
import java.util.StringTokenizer;

public class al_10952 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a <= 0 || b > 10) break;
			
			sb.append(a+b).append("\n");
			
		}
		
		System.out.println(sb);
	}
}
