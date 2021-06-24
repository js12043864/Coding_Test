package Step_8;

import java.util.Scanner;

public class P1712 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(c <= b) {
            System.out.println(-1);
        }else {
            int d = a / (c - b);
            System.out.println(d+1);
        }
    }

}
