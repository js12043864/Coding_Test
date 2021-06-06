package Step_2;

import java.util.Scanner;

public class P2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if (m < 45) {
			if (h == 0) {
				h = 23;
			} else {
				h = h - 1;
			}
			m = m + 60 - 45;
			System.out.println(h + " " + m);
		} else {
			m = m - 45;
			System.out.println(h + " " + m);
		}
	}

}
