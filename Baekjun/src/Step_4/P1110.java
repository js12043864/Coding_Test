package Step_4;

import java.util.Scanner;

public class P1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = Integer.parseInt(a);
		int f = b;
		int cnt = 0;
		while(true) {
			cnt++;
			String[] place;
			String[] place2;
			String e;
			if(b < 10) {
				String c = "0" + Integer.toString(b);
				place = c.split("");
			}else {				
				place = Integer.toString(b).split("");
			}
			int d = Integer.parseInt(place[0]) + Integer.parseInt(place[1]);
			if(d >= 10) {
				place2 = Integer.toString(d).split("");
				e = place[1] + place2[1];
			}else {
				e = place[1] + Integer.toString(d);
			}
			b = Integer.parseInt(e);
			if(b == f) {
				System.out.println(cnt);
				break;
			}
		}
	}
}
