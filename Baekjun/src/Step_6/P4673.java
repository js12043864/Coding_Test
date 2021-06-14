package Step_6;

import java.util.ArrayList;

public class P4673 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int dn = 0;
        for(int i = 1; i < 10000; i++) {
            answer.add(i);
        }
        for(int i = 1; i < 10000; i++) {
            if(i < 10) {
                dn = i + i % 10; 
            }else if(i < 100) {
                dn = i + i % 10 + i / 10;
            }else if(i < 1000) {
                dn = i + i % 10 + (i % 100) / 10 + i / 100;
            }else {
                dn = i + i % 10 + i / 1000 + (i / 100) % 10 + (i / 10) % 10;
            }
            for(int j = 0; j < answer.size(); j++) {
                if(dn == answer.get(j)) {
                    answer.remove(answer.get(j));
                }
            }
        }
        for(int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }

}
