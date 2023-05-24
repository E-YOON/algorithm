// 신기한 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b17618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=1; i<=N; i++) {
            int num = i;
            int sum = 0;
            
            while(true) {
                if(num == 0) break;

                sum += num % 10;
                num /= 10;
            }

            if(i % sum == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}