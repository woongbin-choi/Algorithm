package Array;

import java.io.*;

public class al_2577 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		
		int input = num1*num2*num3;
		
		int[] number = new int[10];
		
		while(input > 10) {
			int num = input % 10;
			for(int j=0; j < number.length; ++j) {
				if(j == num) number[j]++;
				
			}
			input /= 10;
			
		}
		number[input]++;
		
		for (int a : number) System.out.println(a);
		
	}
}
