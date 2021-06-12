package Step_5;

import java.util.HashSet;
import java.util.Scanner;

public class P3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hash = new HashSet<Integer>();
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			hash.add(a % 42);
		}
		System.out.println(hash.size());
	}

}
