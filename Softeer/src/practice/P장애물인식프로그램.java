package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P장애물인식프로그램 {
	static int[] dirX = {0,0,-1,1};
	static int[] dirY = {1,-1,0,0};
	static boolean[][] visited;
	static int[][] arr;
	static int N, nowX, nowY, blockCnt;
	
	static ArrayList<Integer> list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        
        arr = new int[N][N];
        visited = new boolean[N][N];
        
        for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for(int j = 0; j < N; j++) {
				arr[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}
        
        int count = 0;
        list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
        	for (int j = 0; j < N; j++) {
        		if(!visited[i][j] && arr[i][j] != 0) {
        			blockCnt = 0;
        			dfs(i, j);
        			count++;
        			list.add(blockCnt);
        		}
        	}
        }
        Collections.sort(list);
        System.out.println(count);
        for(int cnt : list) {
        	System.out.println(cnt);
        }
	}
	
	public static void dfs(int x, int y) {
		blockCnt++;
		visited[x][y] = true;
		for(int i = 0; i < 4; i++) {
			int nowX = x + dirX[i];
			int nowY = y + dirY[i];
			if(nowX < 0 || nowY < 0 || nowX >= N || nowY >= N) continue;
				if(!visited[nowX][nowY] && arr[nowX][nowY] != 0) {
					dfs(nowX, nowY);
				}
			}
		}
	
	public static boolean rangeCheck(int x, int y) {
		return (x >= 0 && y >= 0 && x < N && y < N);
	}

}
