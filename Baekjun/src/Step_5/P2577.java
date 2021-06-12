package Step_5;

import java.util.Scanner;

public class P2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a * b * c;
		int cnt;
		String result = Integer.toString(d);
		String[] num = result.split("");
		for(int i = 0; i < 10; i++) {
			cnt = 0;
			for(int j = 0; j < num.length; j++) {
				if(Integer.parseInt(num[j]) == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}

}
