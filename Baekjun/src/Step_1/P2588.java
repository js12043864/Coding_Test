package Step_1;

import java.util.Scanner;

public class P2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String b_str = Integer.toString(b);
		for(int i = 0; i < b_str.length(); i++) {
			String num_str = b_str.substring(b_str.length() - i - 1 , b_str.length() - i); 
			int c = Integer.parseInt(num_str) * a;
			System.out.println(c);
		}
		System.out.println(a*b);
	}

}
