package practice;

import java.util.*;
import java.io.*;


public class P¼ºÀûÆò±Õ
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] point = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            point[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();        
        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken());
            
            double sum = 0.0;
            for(int j = start; j < end; j++) {
                sum += point[j];
            }

            double avg = (sum / (end - start)) ;
            sb.append(String.format("%.2f", avg) + "\n");    
        }
        System.out.println(sb);
    }
}