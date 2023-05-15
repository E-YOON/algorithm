// 공 넣기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N+1];

        for(int t=0; t<M; t++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for(; i<=j; i++) {
                basket[i] = k;
            }
        }

        for(int i=1; i<basket.length; i++) {
            System.out.print(basket[i]);
            if(i == basket.length) {
                break;
            } else {
                System.out.print(" ");
            }
        }
    }
}
