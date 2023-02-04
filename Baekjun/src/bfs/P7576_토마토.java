package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7576_≈‰∏∂≈‰ {
	static int[] dirX = {0,0,-1,1};
	static int[] dirY = {1,-1,0,0};
	static int[][] arr;
	static int M,N;
	static Queue<Tomato> q;
	static class Tomato {
		int x, y;
		
		Tomato(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new int[M][N];
        q = new LinkedList<>();
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] == 1) {
					q.offer(new Tomato(i,j));
				}
			}
		}

		System.out.println(bfs());
	}
	
    static int bfs() {
    	while(!q.isEmpty()) {
    		Tomato tomato = q.poll();
    		for(int i = 0; i< 4; i++) {
    			int nowX = tomato.x + dirX[i];
    			int nowY = tomato.y + dirY[i];
    			
    			if(rangeCheck(nowX, nowY)) {
    				if(arr[nowX][nowY] == 0) {
    					q.offer(new Tomato(nowX, nowY));
    					arr[nowX][nowY] = arr[tomato.x][tomato.y] + 1;
    				}
    			}
     		}
    	}
    	
    	int result = 0;
    	
    	for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j] == 0) {
					return -1;
				}
				result = Math.max(result,  arr[i][j]);
			}
		}
    	if(result == 1) {
    		return 0;
    	} else {
    		return result - 1;
    	}
    }
    
	static boolean rangeCheck(int nowX, int nowY) {
		return (nowX >=0 && nowY >= 0 && nowX < M && nowY <N);
	}
	
	static int safeCount() {
		int cnt = 0;
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j] == 0) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}