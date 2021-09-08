package For;

import java.io.*;

public class al_2741 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; ++i) {
			bw.write(i+"\n");
		}
		bw.flush();
	}
}
