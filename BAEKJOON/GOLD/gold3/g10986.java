// 나머지 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class g10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] S = new long[N];
        long[] C = new long[M];
        long answer = 0;

        st = new StringTokenizer(br.readLine());
        // 합 배열 만들기
        S[0] = Integer.parseInt(st.nextToken());
        for(int i=1; i<N; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        // 합 배열에 나머지 연산
        for(int i=0; i<N; i++) {
            int remainder = (int) (S[i] % M);

            // 구간합의 나머지가 0일 때 정답에 더하기
            if(remainder == 0) answer++;

            // 나머지가 같은 개수 카운팅
            C[remainder]++;
        }

        for(int i=0; i<M; i++) {
            if(C[i] > 1) {
                // 나머지가 같은 인덱스 중 2가지를 뽑는 경우의 수
                answer += (C[i] * (C[i]-1) / 2);
            }
        }

        System.out.println(answer);

    }
}