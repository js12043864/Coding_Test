package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P동계테스트시점예측 {
	static int[] dirX = {0,0,-1,1};
	static int[] dirY = {1,-1,0,0};
	static boolean[][] visited;
	static int[][] arr, melt;
	static int N, M, nowX, nowY;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr = new int[N][N];
        
        for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
        
        int cnt = 0;
        while (true) {
        	separateOuterIce();
        	
        	if(check() == 0) {
        		break;
        	}
        	
        	melting();
        	cnt++;
        }
        System.out.println(cnt);
	}
	
	static int check() {
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(!visited[i][j] && arr[i][j] == 1) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	static void separateOuterIce() {
		visited = new boolean[N][M];
		melt = new int[N][M];
		
		dfsForOuterIce(0,0);
	}
	
	static void dfsForOuterIce(int x, int y) {
		visited[x][y] = true;
		
		for(int i = 0; i< 4; i++) {
			nowX = x + dirX[i];
			nowY = y + dirY[i];
			
			if (rangeCheck() && !visited[nowX][nowY] && arr[nowX][nowY] == 0) {
				dfsForOuterIce(nowX, nowY);
			}
		}
	}
	
	static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i = 0; i< 4; i++) {
			nowX = x + dirX[i];
			nowY = y + dirY[i];
			
			if (rangeCheck() && visited[nowX][nowY] && arr[nowX][nowY] == 0) {
				melt[x][y]++;
				continue;
			}
			
			if (rangeCheck() && !visited[nowX][nowY] && arr[nowX][nowY] ==1) {
				dfs(nowX, nowY);
			}
		}
	}
	
	static boolean rangeCheck() {
		return (nowX >= 0 && nowY >= 0 && nowX < N && nowY < N);
	}
	
	static void melting() {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if (melt[i][j] >= 2) {
					arr[i][j] = 0;
				}
			}
		}
	}
}
