package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1931_회의실배정 {

	static class Info implements Comparable<Info> {
		int start;
		int end;

		Info(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Info o) {
			if (this.end == o.end) {
				return this.start - o.start;
			}

			return this.end - o.end;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.parseInt(st.nextToken());

		Info[] info = new Info[max];
		for (int i = 0; i < max; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			info[i] = new Info(start, end);
		}
		
		Arrays.sort(info);
		
		int prev_endTime = 0;
		int cnt = 0;
		for (Info infos : info) {
			if (prev_endTime <= infos.start) {
				prev_endTime = infos.end;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
