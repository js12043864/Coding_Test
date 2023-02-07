package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1026_º¸¹° {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(st.nextToken());

		int[] A = new int[length];
		int[] B = new int[length];

		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < length; j++) {
				if (i == 1) {
					B[j] = Integer.parseInt(st.nextToken());
				} else {
					A[j] = Integer.parseInt(st.nextToken());
				}
			}
		}
		Arrays.sort(A);
		Arrays.sort(B);

		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += A[i] * B[length - i - 1];
		}
		System.out.println(sum);
	}

}
