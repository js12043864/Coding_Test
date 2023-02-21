package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2206벽부수고이동하기 {
	
	static int[] dirX = { 0, 0, -1, 1};
	static int[] dirY = { 1, -1, 0, 0};
	static int[][] arr, countMap;
	static boolean[][] visited;
	static int N, M;
	static boolean didBreak;
	static Queue<Info> q;

	static class Info {
		int x, y;
		boolean didBreak;

		Info(int x, int y, boolean didBreak) {
			this.x = x;
			this.y = y;
			this.didBreak = didBreak;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		countMap = new int[N][M];
		visited = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for(int j = 0; j < M; j++) {
				arr[i][j] = Character.getNumericValue(input.charAt(j));
			}
		}
		
		q = new LinkedList<>();
		bfs();
		
		if(countMap[N-1][M-1] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(countMap[N-1][M-1]);
		}
	}
	
	static void bfs() {
		visited[0][0] = true;
		q.offer(new Info(0, 0, false));
		countMap[0][0] = 1;

		while (!q.isEmpty()) {
			Info info = q.poll();
			int x = info.x;
			int y = info.y;
			boolean didBreak = info.didBreak;
			
			if(x == N -1 && y == M -1) {
				return;
			}
			
			for (int i = 0; i < 4; i++) {
				int nx = x + dirX[i];
				int ny = y + dirY[i];
				
				if(nx == N -1 && ny == M -1) {
					countMap[nx][ny] = countMap[x][y] + 1;
					return;
				}

				if (rangeCheck(nx, ny) && !visited[nx][ny]) {
					if (arr[nx][ny] != 0) {
						if (!didBreak) {
							q.offer(new Info(nx, ny, true));
						}
					} else {
						if(!didBreak) {
							q.offer(new Info(nx, ny, false));
						} else {
							q.offer(new Info(nx, ny, true));
						}
					}
					visited[nx][ny] = true;
					countMap[nx][ny] = countMap[x][y] + 1;
				}
			}
		}
	}

	static boolean rangeCheck(int x, int y) {
		return (x >= 0 && y >= 0 && x < N && y < M);
	}
}
