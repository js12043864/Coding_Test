package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P�����ڵ����� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        int[] dp = new int[N + 1];
        //���� ���� ����
        dp[0] = 2;
        for(int i = 1; i <= N; i++) {
        	dp[i] = dp[i - 1] * 2 -1;
        }
        
        System.out.println(dp[N] * dp[N]);

	}

}
