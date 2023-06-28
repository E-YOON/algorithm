// 대회 자리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b5176 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] seats = new int[M];
            int count = 0;

            for(int j=0; j<P; j++) {
                int num = Integer.parseInt(br.readLine());
                if(seats[num-1] == 0) {
                    seats[num-1] = 1;
                } else {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
