package StandardMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_3053 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		double R = Double.parseDouble(br.readLine());
		
		sb.append(Math.PI * R * R).append('\n').append(2 * R * R);
		
		System.out.println(sb);
		br.close();
	}
	
}
