package Step_5;

import java.util.Scanner;

public class P4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] grade = new String[sc.nextInt()];
		sc.nextLine();
		for (int i = 0; i < grade.length; i++) {
			grade[i] = sc.nextLine();
		}
		for(int j = 0; j < grade.length; j++) {
			String[] point = grade[j].split(" ");
			for(int m = 0; m < point.length; m++) {
			}
			double preTotal = 0.0;
			int cnt = 0;
			for (int k = 1; k < point.length; k++) {
				preTotal += Double.parseDouble(point[k]);
			}
			double preAvg = preTotal / Integer.parseInt(point[0]);
			for (int l = 1; l < point.length; l++) {
				if (preAvg < Double.parseDouble(point[l])) {
					cnt++;
				}
			}
			double avg = (cnt / Double.parseDouble(point[0])) * 100;
			System.out.printf("%.3f%%\n",avg);
		}
	}

}
