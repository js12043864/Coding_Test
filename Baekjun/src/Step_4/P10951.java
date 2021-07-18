package Step_4;

import java.util.ArrayList;
import java.util.Scanner;

public class P10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			array.add(a+b);
		}
		for(int c : array) {
			System.out.println(c);
		}
	}
}
