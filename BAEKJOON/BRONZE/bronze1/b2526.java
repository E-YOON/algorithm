// 싸이클

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[] arr = new int[1000];
        int num = N;
        int idx = 1;

        while(true) {
            num = (num * N) % P;
            idx++;
            if(arr[num] != 0) {
                System.out.println(idx - arr[num]);
                break;
            }
            arr[num] = idx;
        }
    }
}
