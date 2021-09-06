package While;

import java.io.*;
import java.util.StringTokenizer;

public class al_10951 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String str;
		
		while((str = br.readLine()) != null) {
			
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a+b).append("\n");
			
		}
		
		System.out.println(sb);
	}
}
