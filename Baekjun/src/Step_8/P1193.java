package Step_8;

import java.util.Scanner;

public class P1193 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        while(true) {
            int max = maxNum(count);
            if(num <= max) {
                if(count % 2 == 0) {
                    int cnt = count;
                    for(int i = 1; i<=count; i++) {
                        if(max == num) {
                            System.out.println(cnt + "/" + i);
                            break;
                        }else {
                            max--;
                            cnt--;
                        }
                    }
                }else {
                    int cnt = count;
                    for(int i = 1; i<=count; i++) {
                        if(max == num) {
                            System.out.println(i + "/" + cnt);
                            break;
                        }else {
                            max--;
                            cnt--;
                        }
                    }
                }
                break;
            }
            count++;
        }
        
 
    }
    
    public static int maxNum(int number) {
        if(number == 1) {
            return 1;
        }else {
            return number + maxNum(--number);
        }
    }
}
