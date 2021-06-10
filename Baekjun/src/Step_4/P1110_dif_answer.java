package Step_4;

import java.util.Scanner;

public class P1110_dif_answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		int copy = N;		
		int count = 0;
		 
		while(true){
			N = ( (N%10)*10 ) + ( ((N/10) + (N%10))%10 );
			count++;
		 
			if(copy == N){
				System.out.println(count);
				break;
			}
		}
	}
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	 
//	int N = Integer.parseInt(br.readLine());
//	
//	int cnt = 0;
//	int copy = N;
//    
//	do {
//		N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
//		cnt++;
//	} while (copy != N);
//	
//	System.out.println(cnt);
}
