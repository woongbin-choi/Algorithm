package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class al_11720 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) sum +=(value-'0');
		
		System.out.println(sum);
	}
}
