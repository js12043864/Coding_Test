package Step_11;

import java.util.Scanner;

public class P2798 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); //N
        int max = sc.nextInt(); //M
        int close = Integer.MIN_VALUE;
        int[] array = new int[cnt];
        for(int i = 0; i < cnt; i++) {
            array[i] = sc.nextInt();
        }
        
        for(int j = 0; j < cnt - 2; j++) {
            
            for(int k = j + 1; k < cnt; k++) {
                
                for(int l = k + 1; l < cnt; l++) {
                    int sum = array[j] + array[k] + array[l];
                    if(sum <= max) {
                        close = Math.max(close, sum);
                    }
                }
            }
        }
        System.out.println(close);
    }

}
