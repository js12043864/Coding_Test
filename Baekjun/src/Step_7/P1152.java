package Step_7;

import java.util.Scanner;

public class P1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] sp = a.split(" ");
		int size = sp.length;
		for(int i = 0; i < sp.length; i++) {
			if(sp[i].equals("")) {
				size--;
			}
		}
		System.out.println(size);
	}

}
