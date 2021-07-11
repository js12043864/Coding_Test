package Step_9;

import java.util.Scanner;

public class P1978 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[sc.nextInt()];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			int cnt = 0;
			for(int j = 1; j <= array[i]; j++) {
				if(array[i] % j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				total++;
			}
		}
		System.out.println(total);
		
	}

}
