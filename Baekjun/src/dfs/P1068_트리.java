package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1068_Æ®¸® {
	
	static ArrayList<Node>[] arr;
	static int delNode;
	static class Node {
		int chi;
		
		Node(int chi) {
			this.chi = chi;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[N];
		for(int i = 0; i < N; i++) {
			arr[i] = new ArrayList<Node>();
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int val = Integer.parseInt(st.nextToken());
			if(val != -1) {
				arr[val].add(new Node(i));
			}
		}
		
		delNode = Integer.parseInt(br.readLine());
		
		if (delNode == 0) {
			System.out.println(0);
			return;
		}
		
		dfs(0);
		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if(arr[i] != null && arr[i].size() == 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	static void dfs(int nodeNbr) {
		if(arr[nodeNbr].size() == 0) {
			return;
		}
		
		for(int i = 0; i < arr[nodeNbr].size(); i++) {
			if(arr[nodeNbr].get(i).chi == delNode) {
				arr[nodeNbr].remove(i);
				removeAll(delNode);
			} else {
				dfs(arr[nodeNbr].get(i).chi);
			}
		}
	}
	
	static void removeAll(int del) {
		if (arr[del].size() == 0) {
			arr[del] = null;
			return;
		}
		
		for(int i = 0; i < arr[del].size(); i++) {
			removeAll(arr[del].get(i).chi);
		}
		arr[del] = null;
	}

}
