package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2573 {
	static int[] dirX = {0,0,-1,1};
	static int[] dirY = {1,-1,0,0};
	static int nowX, nowY;
	static int[][] arr, melt;
	static int M,N,cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new int[M][N];
        melt = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		cnt = 0;
		int sepCnt = 0;
		while((sepCnt = separateNum()) < 2) {
			if (sepCnt == 0) {
				cnt = 0;
				break;
			}
			cnt++;
            melting();
		}
		System.out.println(cnt);
	}
	
	public static int separateNum() {
		boolean[][] checked = new boolean[M][N];
        melt = new int[M][N];
		int count = 0;
		
		for (int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(!checked[i][j]&& arr[i][j] != 0) {
					dfs(i,j,checked);
					count++;
				}
			}
		}
		return count;
	}
	
	public static void dfs(int x, int y, boolean[][] checked) {
		checked[x][y] = true;
		for(int i = 0; i < 4; i++) {
			nowX = x + dirX[i];
			nowY = y + dirY[i];
			
			if(rangeCheck() && arr[nowX][nowY] == 0) {
				melt[x][y]++;
				continue;
			}
			
			if(rangeCheck() && !checked[nowX][nowY] && arr[nowX][nowY] != 0) {
				dfs(nowX, nowY, checked);
			}
		}
		
	}
	
    public static void melting() {
        for (int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] -= melt[i][j];
		        if (arr[i][j] < 0) {
			        arr[i][j] = 0;
		        }
			}
		}
    }
    
	public static boolean rangeCheck() {
		return (nowX >=0 && nowY >= 0 && nowX < M && nowY <N);
	}

}