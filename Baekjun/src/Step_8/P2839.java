package Step_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2839 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int five = n / 5;
		int cnt = 1;
		while (true) {

			if (five == 0) {
				if(n % 3 != 0) {
					System.out.println(-1);
					break;
				}else {
					System.out.println(n / 3);
					break;
				}
			} else {
				int first = n - five * 5;
				if (first % 5 == 0) {
					System.out.println(n / 5);
					break;
				} else if (first % 3 == 0) {
					System.out.println((five + first / 3));
					break;
				} else {
					five--;
					cnt++;
				}
			}
		}
	}
}
