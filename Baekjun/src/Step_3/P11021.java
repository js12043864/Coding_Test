package Step_3;

import java.util.Scanner;

public class P11021 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] res = new int[a];
        for(int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = b+c;
            res[i] = result;
        }
        
        for(int j = 0; j < a; j++) {
            System.out.println("Case #" + (j+1) + ": " + res[j]);
        }
    }

}
