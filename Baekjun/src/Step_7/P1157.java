package Step_7;

import java.util.Scanner;

public class P1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.toLowerCase();
		int max = Integer.MIN_VALUE;
		int[] array = new int[26];
		for(int i = 0; i < word.length(); i++) {
			byte num = (byte) word.charAt(i);
			array[num - 'a']++; 
		}
		for(int j = 0; j < array.length; j++) {
			max = Math.max(max, array[j]);
		}
		int cnt = 0;
		for(int j = 0; j < array.length; j++) {
			if(array[j] == max) {
				cnt++;
			}
		}
		for(int j = 0; j < array.length; j++) {
			if(cnt != 1) {
				System.out.println("?");
				break;
			}else {
				if(array[j] == max) {
					System.out.println((char) (65+j));
				}
			}
		}
	}

}
