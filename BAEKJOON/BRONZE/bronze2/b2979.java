// 트럭 주차

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[100];
        int answer = 0;
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            int in = Integer.parseInt(st.nextToken());
            int out = Integer.parseInt(st.nextToken());
            start = Math.min(start, in);
            end = Math.max(end, out);

            for(int j=in; j<out; j++) {
                arr[j]++;
            }
        }

        for(int i=start; i<end; i++) {
            if(arr[i] == 1) {
                answer += A*arr[i];
            } else if(arr[i] == 2) {
                answer += B*arr[i];
            } else if(arr[i] == 3) {
                answer += C*arr[i];
            }
        }

        System.out.println(answer);
    }
}
