package Step_5;

import java.util.Arrays;
import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double[] array = new double[a];
		double sum = 0;
		int max = 0;
		for(int i = 0; i < a; i++) {
			array[i] = sc.nextDouble();
		}
		Arrays.sort(array);
		for(int i = 0; i < a; i++) {
			array[i] = array[i] / array[a-1] * 100;
			sum += array[i];
		}
		System.out.println(sum/a);
	}

}
