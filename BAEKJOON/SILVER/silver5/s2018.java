// 수들의 합 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int start = 1;
        int end = 1;
        int sum = 1;
        int cnt = 0;

        while(start <= end) {
            if(sum == N) {
                cnt++;
            } 

            if(sum < N) {
                end++;
                sum += end;
            } else if(sum >= N) {
                sum -= start;
                start++;
            }
        }

        System.out.println(cnt);
    }
}