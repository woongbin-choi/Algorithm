package While;

import java.io.*;

public class al_1110 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		int count = 0;
		int res = a;
		
		while(true) {
			int guess = ((a%10)*10 + (a/10+a%10)%10);
			a = guess;
			
			count++;
			if(guess == res) break;
		}
		
		System.out.println(count);
	}
}
