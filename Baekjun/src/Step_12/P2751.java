package Step_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class P2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> al = new ArrayList<Integer>();
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++) {
			al.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(al);
		for(int i : al) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
