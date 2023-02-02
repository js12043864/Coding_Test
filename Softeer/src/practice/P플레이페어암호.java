package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class P플레이페어암호 {
	static class Info {
		int x, y;
		
		Info(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static char[][] array;
	static ArrayList<String> list;
	static Map<Character, Info> map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String plainText = st.nextToken();
        
        st = new StringTokenizer(br.readLine());
        String key = st.nextToken();
        
        putArray(key);
        
        changeText(plainText);
        
        change();
	}
	
	static void change() {
		StringBuilder sb =new StringBuilder();
		
		for(int i = 0; i < list.size(); i++) {
			Info info1 = map.get(list.get(i).charAt(0));
			Info info2 = map.get(list.get(i).charAt(1));
			char ch1;
			char ch2;
			if (info1.x == info2.x) {
				ch1 = array[info1.x][rangeCheck(info1.y)];
				ch2 = array[info2.x][rangeCheck(info2.y)];
			} else if (info1.y == info2.y) {
				ch1 = array[rangeCheck(info1.x)][info1.y];
				ch2 = array[rangeCheck(info2.x)][info2.y];
			} else {
				ch1 = array[info1.x][info2.y];
				ch2 = array[info2.x][info1.y];
			}
			sb.append(ch1);
			sb.append(ch2);
		}
		System.out.println(sb);;
	}
	
	static int rangeCheck(int position) {
		if (position == 4) {
			position = 0;
		} else {
			position++;
		}
		
		return position;
	}
	
	static void changeText(String plain) {
		list = new ArrayList<String>();
		Queue<Character> q = new LinkedList<>();
		for (int i = 0; i < plain.length(); i++) {
			q.offer(plain.charAt(i));
		}
		
		while(!q.isEmpty()) {
			char ch1 = q.poll();
			char ch2;
			
			if (q.size() > 0) {
				ch2 = q.peek();
				if (ch1 == ch2 && ch1 == 'X') {
					ch2 = 'Q';
				} else if (ch1 == ch2) {
					ch2 = 'X';
				} else {
					ch2 = q.poll();
				}
			} else {
				ch2 = 'X';
			}
			list.add(String.valueOf(ch1) + String.valueOf(ch2));
		}
	}
	
	static void putArray(String plain) {
		ArrayList<Character> list = new ArrayList<>();
		array = new char[5][5];
		map = new HashMap<>();
		
		for(int i = 0; i < plain.length(); i++) {
			if(!list.contains(plain.charAt(i))) {
				list.add(plain.charAt(i));
			}
		}
		if (list.size() != 25) {
			for (int i = 65; i < 91; i++) {
				if (i == 74) {
					continue;
				}
				char c = (char) i;
				if (!list.contains(c)) {
					list.add(c);
				}
			}
		}
		
		int index = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = list.get(index);
				map.put(array[i][j], new Info(i,j));
				index++;
			}
		}
		
	}
	
	//다른 방법
	static char[][] anotherPutArray(String key) {
		char[][] map = new char[5][5];
		boolean[] alpha = new boolean[26];
		alpha['J' - 'A'] = true;
		
		int idx = 0;
		
		for(int i = 0 ; i < key.length(); i++) {
			int item = key.charAt(i) - 'A';
			if (alpha[item]) {
				continue;
			}
			alpha[item] = true;
			map[idx / 5][idx % 5] = (char) (i + 'A');
			idx++;
		}
		
		return map;
	}
	

}
