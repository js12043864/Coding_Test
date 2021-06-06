package Step_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		int[] answer = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			answer[i] = a + b;
		}
		for(int j = 0; j < cnt; j++) {
			bw.write(answer[j]);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
