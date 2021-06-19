package Step_7;

import java.util.Scanner;

public class P2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] sp = a.split(" ");
		String[] sp2 = sp[0].split("");
		String[] sp3 = sp[1].split("");
		String b = sp2[2] +sp2[1] + sp2[0];
		String c = sp3[2] +sp3[1] + sp3[0];
		if(Integer.parseInt(b) > Integer.parseInt(c)) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}

//
//int A = in.nextInt();
//int B = in.nextInt();
//
//in.close();
//
//A = Integer.parseInt(new StringBuilder().append(A).reverse().toString()); stringbuilder - 문자열 다루는 클래스, reverse는 문자열 뒤집는다. 그리고 문자열로 바꿈
//B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
//
//System.out.print(A > B ? A : B);
