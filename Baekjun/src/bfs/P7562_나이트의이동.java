package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7562_나이트의이동 {

	static int[] dirX = { 2, 2, -2, -2, 1, 1, -1, -1 };
	static int[] dirY = { 1, -1, 1, -1, 2, -2, -2, 2 };
	static int arr[][];
	static boolean[][] checked;
	static Queue<Info> q;
	static int len, toX, toY;

	static class Info {
		int x, y;

		Info(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int testNbr = Integer.parseInt(st.nextToken());
		ArrayList<Integer> answer = new ArrayList<>();
		
		for (int i = 0; i < testNbr; i++) {
			st = new StringTokenizer(br.readLine());
			len = Integer.parseInt(st.nextToken());

			arr = new int[len][len];
			checked = new boolean[len][len];
			q = new LinkedList<Info>();
			
			st = new StringTokenizer(br.readLine());
			int fromX = Integer.parseInt(st.nextToken());
			int fromY = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			toX = Integer.parseInt(st.nextToken());
			toY = Integer.parseInt(st.nextToken());

			bfs(fromX, fromY);
			
			answer.add(arr[toX][toY]);
		}
		
		for(int ans : answer) {
			System.out.println(ans);
		}
	}

	static void bfs(int x, int y) {
		if (x == toX && y == toY) {
			return;
		}
		q.offer(new Info(x, y));
		checked[x][y] = true;

		while (!q.isEmpty()) {
			Info info = q.poll();
			int firX = info.x;
			int firY = info.y;
			for (int i = 0; i < 8; i++) {
				int nowX = firX + dirX[i];
				int nowY = firY + dirY[i];

				if (nowX == toX && nowY == toY) {
					arr[nowX][nowY] = arr[firX][firY] + 1;
					return;
				}

				if (rangeCheck(nowX, nowY) && !checked[nowX][nowY]) {
					checked[nowX][nowY] = true;
					q.offer(new Info(nowX, nowY));
					arr[nowX][nowY] = arr[firX][firY] + 1;
				}
			}
		}
	}

	static boolean rangeCheck(int nowX, int nowY) {
		return (nowX >= 0 && nowY >= 0 && nowX < len && nowY < len);
	}
}
