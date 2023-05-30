// 완전제곱수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=1; i*i<=N; i++) {
            if(i*i >= M && i*i <= N) {
                min = Math.min(min, i*i);
                sum += i*i;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
