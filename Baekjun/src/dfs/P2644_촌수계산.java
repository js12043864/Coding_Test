package dfs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2644_ÃÌ¼ö°è»ê {
	static List<ArrayList<Integer>> list;
	static boolean[] visited;
	static int ans = -1;
	static int totalCnt;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		totalCnt = sc.nextInt();
		int firstPerson = sc.nextInt();
		int secondPerson = sc.nextInt();
		int relationCnt = sc.nextInt();

		list = new ArrayList<>();
		for (int i = 0; i < totalCnt + 1; i++) {
			list.add(new ArrayList<Integer>());
		}

		visited = new boolean[totalCnt + 1];

		for (int i = 0; i < relationCnt; i++) {
			int parent = sc.nextInt();
			int child = sc.nextInt();
			list.get(parent).add(child);
			list.get(child).add(parent);
		}

		for (int i = 1; i < totalCnt + 1; i++) {
			if (!visited[i]) {
				dfs(firstPerson, secondPerson, 0);
			}
		}
		System.out.println(ans);
	}

	public static void dfs(int start, int end, int count) {
		visited[start] = true;

		for (int num : list.get(start)) {
			if (!visited[num]) {
				if (num == end) {
					ans = count + 1;
					return;
				}
				dfs(num, end, count + 1);
			}
		}
	}
}
