package Step_4;

import java.util.ArrayList;
import java.util.Scanner;

public class P10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) {
				for (int i = 0; i < array.size(); i++) {
					System.out.println(array.get(i));
				}
				break;
			} else {
				array.add(a + b);
			}
		}
	}

}
