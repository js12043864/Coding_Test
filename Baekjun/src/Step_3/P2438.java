package Step_3;

import java.util.Scanner;

public class P2438 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
