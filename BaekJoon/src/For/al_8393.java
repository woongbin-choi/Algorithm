package For;

import java.io.*;

public class al_8393 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int result = 0;
		
		for (int i = 1; i <= a; ++i) {
			result += i;
		}
		
		System.out.println(result);
	}
}
