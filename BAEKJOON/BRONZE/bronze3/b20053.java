// 최소, 최대 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b20053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<N; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            System.out.println(min + " " + max);
        }
    }
}
