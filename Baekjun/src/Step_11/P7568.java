package Step_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> arl = new ArrayList<String>();
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(),"\n");
			arl.add(st.nextToken());
		}
		for(int j = 0; j < arl.size(); j++) {
			int cnt = 1;
			String[] sp = arl.get(j).split(" ");
			int weight = Integer.parseInt(sp[0]);
			int height = Integer.parseInt(sp[1]);
			for(int k = 0; k < arl.size(); k++) {
				String[] sp1 = arl.get(k).split(" ");
				int weight2 = Integer.parseInt(sp1[0]);
				int height2 = Integer.parseInt(sp1[1]);
				if(weight < weight2 && height < height2) {
					cnt++;
				}
			}
			System.out.print(cnt + " ");
		}
	}
//	다른 풀이
//	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//	
//	
//	int n=Integer.parseInt(br.readLine());
//	
//	int[][] inbody=new int[n][3];
//	
//	for(int i=0;i<n;i++) {
//		StringTokenizer st=new StringTokenizer(br.readLine());
//		
//		inbody[i][0]=Integer.parseInt(st.nextToken());
//		inbody[i][1]=Integer.parseInt(st.nextToken());
//		inbody[i][2]=1;
//	}
//	
//	for(int i=0;i<n;i++) {
//		for(int j=0;j<n;j++) {
//			if(inbody[i][0]<inbody[j][0] && inbody[i][1]<inbody[j][1]) {
//				inbody[i][2]++;
//			}
//		}
//	}
//	
//	for(int i=0;i<n;i++) {
//		System.out.print(inbody[i][2] + " ");
//	}
}
