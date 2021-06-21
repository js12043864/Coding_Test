package Step_7;

import java.util.Scanner;

public class P2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] array = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		for (int i = 0; i < array.length; i++) {
			while (a.contains(array[i])) {
				a = a.replaceFirst(array[i], "_");
				if(a.contains(array[i]) == false) {
					break;
				}
			}
		}
		System.out.println(a.length());
	}

}
