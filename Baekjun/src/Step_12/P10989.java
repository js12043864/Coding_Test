package Step_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int[] array = new int[10001];
		for(int i = 0; i < a; i++) {
			array[Integer.parseInt(br.readLine())]++;
		}
		for(int j = 0; j < array.length; j++) {
			while(array[j] > 0) {
				bw.write(j + "\n");
				array[j]--;
			}
		}
		bw.flush();
	}

}
