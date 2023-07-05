// 유레카 이론

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[45];
        for(int i=1; i<45; i++) {
            arr[i] = i * (i + 1) / 2;
        }

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int K = Integer.parseInt(br.readLine());
            System.out.println(eureka(K, arr));
        }
    }

    public static int eureka(int K, int[] arr) {
        for(int a=1; a<45; a++) {
            for(int b=1; b<45; b++) {
                for(int c=1; c<45; c++) {
                    if(arr[a] + arr[b] + arr[c] == K) return 1;
                }
            }
        }

        return 0;
    }
}
