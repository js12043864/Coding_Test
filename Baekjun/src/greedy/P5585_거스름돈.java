package greedy;

import java.util.Scanner;

public class P5585_°Å½º¸§µ· {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cash = 1000 - sc.nextInt();
		
		System.out.println(countCash(cash));
	}
	
	static int countCash(int cash) {
		int[] cashArray = {500,100,50,10,5,1};
		int sum = 0;
		
		for (int i = 0; i < cashArray.length; i++) {
			sum += cash / cashArray[i];
			cash %= cashArray[i];
			
			if(cash == 0) {
				break;
			}
		}
		return sum;
	}

}
