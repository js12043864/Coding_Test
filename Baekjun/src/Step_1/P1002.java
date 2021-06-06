package Step_1;

import java.util.Scanner;

public class P1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a * 6;
		int[] array = new int[b];
		for(int i = 0; i < b; i++) {
			array[i] = sc.nextInt();
		}
		
	}
}
