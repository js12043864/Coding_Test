package Step_3;

import java.util.Scanner;

public class P8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(result(num));
	}

	public static int result(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num + result(--num);
		}
	}

}
