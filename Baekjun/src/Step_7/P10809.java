package Step_7;

import java.util.Scanner;

public class P10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] alph = new int[26];
		for (int i = 0; i < alph.length; i++) {
			alph[i] = -1;
		}
		String word = sc.nextLine();
		for (int j = 97; j < 123; j++) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == (char) j && alph[j-97] == -1) {
					alph[j - 97] = i;
				}
			}
		}
		for(int result : alph) {
			System.out.print(result + " ");
		}
	}
}
