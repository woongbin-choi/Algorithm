import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {

		HashSet<Integer> ranHash = new HashSet<>();
		while(ranHash.size() <= 3) {
			int ran_num = (int)(Math.random() * 10);
			ranHash.add(ran_num);
		}
		
		ArrayList<Integer> ran_array = new ArrayList<>(ranHash);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;

		while(count < 8) {
			int user = Integer.parseInt(br.readLine());
			int[] reverse_array = new int[4];

			for(int i = 0; i < reverse_array.length; ++i) {
				reverse_array[i] = user % 10;
				user /= 10;
			}

			int[] user_array = new int[4];
			for (int i = reverse_array.length -1, j = 0; i >= 0; --i, ++j) {
				user_array[j] = reverse_array[i];
			}
			int strike = 0, ball = 0;

			for (int i = 0; i < ran_array.size(); ++i) {
				for (int j = 0; j < user_array.length; ++j) {
					if (i == j && ran_array.get(i) == user_array[j]) strike++;
					else if (ran_array.get(i) == user_array[j]) ball++;
				}
			}
			System.out.println("랜덤 번호"+ran_array.toString());
			System.out.println("뽑은 번호"+Arrays.toString(user_array));
			System.out.printf("%dStrike\t%dBall",strike,ball);

			count++;
		}

	}

}
