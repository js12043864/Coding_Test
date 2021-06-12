package Step_5;

import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		int place = 0;
		int max = 0;
		for(int i = 0; i < 9; i++) {
			int a = sc.nextInt();
			array[i] = a;
		}
		for(int j = 0; j < 9; j++) {
			max = Math.max(max, array[j]);
		}
		for(int k = 0; k < 9; k++) {
			if(array[k] == max) {
				place = k+1;
			}
		}
		System.out.println(max + " " + place);
	}

}
