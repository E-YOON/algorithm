// 한수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        if(N < 100) {
            System.out.println(N);

        } else {
            int count = 99;

            for(int i=100; i<=N; i++) {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                if((a - b) == (b - c)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
