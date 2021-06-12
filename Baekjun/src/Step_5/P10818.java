package Step_5;

import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = 0;
		int min = Integer.MAX_VALUE;
		int[] array = new int[a];
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			array[i] = b;
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(min + " " + max);
	}

}
