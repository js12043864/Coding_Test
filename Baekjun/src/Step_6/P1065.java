package Step_6;

import java.util.Scanner;

public class P1065 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 99;
        if(a < 100) {
            cnt = a;
        }else {
            for(int i = 100; i <= a; i++) {
                int hund = i / 100;
                int ten = (i % 100) / 10;
                int one = i % 10;
                if(hund - ten == ten - one) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}
