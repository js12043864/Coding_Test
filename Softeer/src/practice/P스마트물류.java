package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P스마트물류 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        String str = br.readLine();
        char[] array = new char[N];
        int cnt = 0;
        
        for (int i = 0; i < N; i++) {
        	array[i] = str.charAt(i);
        }
        for (int i = 0; i < N; i++) {
        	if(array[i] == 'P') {
                for (int j = i - K; j <= i + K; j++) {
                	if(j < 0 || j >= N) {
                		continue;
                	}
                	if (array[j] == 'H') {
                		array[j] = 'O';
                		cnt++;
                		break;
                	}
                }
        	}
        }
        System.out.println(cnt);
	}

}
