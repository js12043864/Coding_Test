package Step_7;

import java.util.Scanner;

public class P5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String[] array = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		int leng = word.length();
		int total = 0;
		String[] sp = word.split("");
		for(int i = 0; i < leng; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[j].contains(sp[i])) {
					total = total + j + 2;
				}
			}
		}
		total += leng;
		System.out.println(total);
	}

}
