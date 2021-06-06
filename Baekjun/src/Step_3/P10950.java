package Step_3;

import java.util.Scanner;

public class P10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] answer = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			answer[i] = a + b;
		}
		for(int j = 0; j < cnt; j++) {
			System.out.println(answer[j]);
		}
	}

}
