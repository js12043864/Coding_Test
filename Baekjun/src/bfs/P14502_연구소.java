package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P14502_¿¬±¸¼Ò {
	static int[] dirX = {0,0,-1,1};
	static int[] dirY = {1,-1,0,0};

	static int[][] map, visualMap;
	static int M,N,answer;
	
	static Queue<Virus> q;
	
	static class Virus {
		int x, y;
		
		Virus(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		map = new int[M][N];
        visualMap = new int[M][N];
        q = new LinkedList<>();
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0);
		System.out.println(answer);
	}
	
	public static void dfs(int wallCnt) {
		if(wallCnt == 3) {
			copy();
			bfs();
			answer = Math.max(answer, safeCount());
			return;
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					dfs(wallCnt+1);
					map[i][j] = 0;
				}
			}
		}
	}
	
    public static void copy() {
        for (int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				visualMap[i][j] = map[i][j];
				
		        if (visualMap[i][j] == 2) {
		        	q.offer(new Virus(i,j));
		        }
			}
		}
    }
    
    static void bfs() {
    	while(!q.isEmpty()) {
    		Virus virus = q.poll();
    		for(int i = 0; i< 4; i++) {
    			int nowX = virus.x + dirX[i];
    			int nowY = virus.y + dirY[i];
    			
    			if(rangeCheck(nowX, nowY) && visualMap[nowX][nowY] == 0) {
    				visualMap[nowX][nowY] = 2;
    				q.offer(new Virus(nowX, nowY));
    			}
     		}
    	}
    }
    
	static boolean rangeCheck(int nowX, int nowY) {
		return (nowX >=0 && nowY >= 0 && nowX < M && nowY <N);
	}
	
	static int safeCount() {
		int cnt = 0;
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(visualMap[i][j] == 0) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}