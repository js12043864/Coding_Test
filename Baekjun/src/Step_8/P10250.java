package Step_8;

import java.util.Scanner;

public class P10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] array = new int[a];
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(d % b == 0) {
				array[i] = b * 100 + (d / b);
			}else {
				array[i] = 100 * (d % b) + ((d / b) + 1);
			}
		}
		for(int j = 0; j < a; j++) {
			System.out.println(array[j]);
		}
	}

}
