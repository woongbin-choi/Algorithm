package StandardMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class al_3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int[] first = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine(), " ");
		int[] second = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine(), " ");
		int[] third = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		
		
		int x,y;
		
		if(first[0] == second[0]) x = third[0];
		else if (first[0] == third[0]) x = second[0];
		else x = first[0];
		
		if(first[1] == second[1]) y = third[1];
		else if (first[1] == third[1]) y = second[1];
		else y = first[1];
		
		sb.append(x).append(" ").append(y);
		System.out.println(sb);
		br.close();
	}
}
