package Step_8;

import java.math.BigInteger;
import java.util.Scanner;

public class P10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] sp = a.split(" ");
		BigInteger big = new BigInteger(sp[0]);
		BigInteger big2 = new BigInteger(sp[1]);
		System.out.println(big.add(big2));
		
	}

}
