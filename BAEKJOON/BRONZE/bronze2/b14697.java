// 방 배정하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b14697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int answer = 0;

        for(int i=0; i<=50; i++) {
            for(int j=0; j<=50; j++) {
                for(int k=0; k<=50; k++) {
                    if((A*i) + (B*j) + (C*k) == N) {
                        answer = 1;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
