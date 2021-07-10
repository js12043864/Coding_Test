package Step_5;

import java.util.Scanner;

public class P8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] answer = new String[num];
		for(int i = 0; i < num; i++) {
			answer[i] = sc.next();
		}
		for(int i = 0; i < num; i++) {
			int cnt = 0;
			int sum = 0;
			for(int j = 0; j < answer[i].length(); j++) {
				if(answer[i].charAt(j) == 'O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
		
	}

}
