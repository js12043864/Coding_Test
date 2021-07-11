package Step_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2581 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int sum = 0, cnt = 0;
		int min = Integer.MAX_VALUE;
		for (int i = m; i <= n; i++) {
			cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				array.add(i);
			}
		}
		if (array.size() == 0) {
			bw.write("-1");
		} else {
			for (int num : array) {
				sum += num;
				min = Math.min(min, num);
			}
			bw.write(sum + "\n" + min);
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
