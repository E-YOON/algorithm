// 영식이와 친구들

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        arr[0] = 1;
        int catcher = 0;
        int count = 0;

        while(true) {
            if(arr[catcher] == M) {
                System.out.println(count);
                break;
            }

            if(arr[catcher]%2 == 1) {
                catcher += L;

            } else {
                catcher -= L;
            }

            if(catcher > N-1) {
                catcher %= N;

            } else if(catcher < 0) {
                catcher += N;
            }

            arr[catcher]++;
            count++;
        }
    }
}
