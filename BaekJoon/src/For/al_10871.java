package For;

import java.io.*;
import java.util.StringTokenizer;

public class al_10871 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st= new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < a; ++i) {
			int c = Integer.parseInt(st.nextToken());
			if(c < b) sb.append(c).append(" ");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
