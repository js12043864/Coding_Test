package Step_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] array = new int[num];
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		for(int i = 0; i < num; i++) {
			System.out.println(array[i]);
		}
	}

}
