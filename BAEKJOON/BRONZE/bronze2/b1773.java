// 폭죽쇼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i=1; i<=C; i++) {
            for(int j=0; j<N; j++) {
                if(i%arr[j] == 0) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
