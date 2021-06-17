package Step_7;

import java.util.Scanner;

public class P2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		String[] array = new String[a];
		for(int i = 0; i < a; i++) {
			array[i] = sc.nextLine();
		}
		for(int j = 0; j < a; j++) {
			String[] sp = array[j].split(" ");
			int b = Integer.parseInt(sp[0]);
			for(int k = 0; k < sp[1].length(); k++) {
				for(int l = 0; l < b; l++) {
					System.out.print(sp[1].charAt(k));					
				}
			}
			System.out.println();
		}
	}

}
