// 요세푸스 문제 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        sb.append("<");

        for(int i=1; i<N+1; i++) {
            que.add(i);
        }

        while(que.size() > 1) {
            for(int i=0; i<K-1; i++) {
                int num = que.poll();
                que.add(num);
            }

            int num = que.poll();
            sb.append(num).append(", ");
        }

        int num = que.poll();
        sb.append(num).append(">");

        System.out.println(sb);
    }
}
