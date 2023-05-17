// 상금 헌터

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] fir = {500, 300, 300, 200, 200, 200, 
                    50, 50, 50, 50, 30, 30, 30, 30, 30,
                    10, 10, 10, 10, 10, 10};
        int[] sec = {512, 256, 256, 128, 128, 128, 128,
                    64, 64, 64, 64, 64, 64, 64, 64,
                    32, 32, 32, 32, 32, 32, 32, 32,
                    32, 32, 32, 32, 32, 32, 32, 32};

        for(int i=0; i<T; i++) {
            int prize = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(0 < a && a < 22) {
                prize += fir[a-1];
            }
            if(0 < b && b < 32) {
                prize += sec[b-1];
            }
            System.out.println(prize * 10000);
        }
    }
}
