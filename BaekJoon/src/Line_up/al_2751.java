package Line_up;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class al_2751 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> arr = new ArrayList<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; ++i) {
			arr.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(arr);

		for(int a : arr){
			sb.append(a).append("\n");
		}
		System.out.println(sb);
	}
}


