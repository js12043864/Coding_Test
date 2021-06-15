package Step_7;

import java.util.Scanner;

public class P11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.nextLine();
		String[] ab = b.split("");
		int sum = 0;
		for(int i = 0; i < a; i++) {
			sum = Integer.parseInt(ab[i]);
		}
		System.out.println(sum);		
	}

}
