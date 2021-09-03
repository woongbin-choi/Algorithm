package For;

import java.io.*;
import java.util.StringTokenizer;

public class al_2439 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		int loop = t;
		
		while(loop != 0) {
			
			for(int i = 1; i <= t; ++i) {
				
				if(i < loop) sb.append(" ");
				else sb.append("*");
			}
			sb.append("\n");
			loop--;
		}
		
		System.out.println(sb);
		br.close();
	}
}
