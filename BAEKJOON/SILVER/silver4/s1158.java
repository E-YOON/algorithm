// 요세푸스 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<>();
        
        for(int i=1; i<=N; i++) {
            que.add(i);
        }

        sb.append("<");

        while(que.size() != 1) {
            for(int i=0; i<K-1; i++) {
                que.offer(que.poll());
            }

            sb.append(que.poll() + ", ");
        }

        sb.append(que.poll() + ">");

        System.out.println(sb);
    }
}
