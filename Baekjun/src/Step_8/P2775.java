package Step_8;

import java.util.Scanner;

public class P2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] result = new int[num];
		int[][] apt = new int[15][15];
		for(int i = 0; i < 15; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		
		for(int j = 1; j < 15; j++) {
			for(int k = 2; k < 15; k++) {
				apt[j][k] = apt[j][k-1] + apt[j-1][k]; 
			}
		}
		for(int a = 0; a < num; a++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			result[a] = apt[num1][num2];
		}
		for(int b = 0; b < num; b++) {
			System.out.println(result[b]);
		}
		
	}
}