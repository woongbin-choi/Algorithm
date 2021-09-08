package Function;

public class al_4673 {
	public static int d(int num) {

		int sum = num;

		while(num != 0) {
			sum += (num % 10);
			num /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {

		boolean[] chk = new boolean[10001];

		for (int i = 0; i < 10001; ++i) {
			int n = d(i);

			if (n < 10001) chk[n] = true;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; ++i) {
			if (!chk[i]) sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
