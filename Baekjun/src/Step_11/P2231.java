package Step_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 0; i < num; i++) {
			int process = i;
			int sum = 0;
			while(process != 0) {
				sum = sum + process % 10;
				process = process / 10;
			}
			if(sum + i == num) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
