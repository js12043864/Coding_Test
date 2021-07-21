package Step_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 1;
		int num2 = 666;
		while(cnt != num) {
			num2++;
			if(String.valueOf(num2).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num2);
	}

}
