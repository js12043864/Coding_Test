package Step_8;

import java.util.Scanner;

public class P2292 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while(true) {
            int sum = maxNum(count);
            if(a <= sum){
                System.out.println(count+1);
                return;
            }
            count++;
        }
    }
    
    public static int maxNum(int number) {
        if(number == 0) {
            return 1;
        }else {
            return number*6 + maxNum(--number);
        }
    }
}
