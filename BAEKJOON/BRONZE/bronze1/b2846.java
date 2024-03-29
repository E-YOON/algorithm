// 오르막길

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2846 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int num = 0;
        int answer = 0;

        for(int i=1; i<N; i++) {
            if(arr[i-1] < arr[i]) {
                num += (arr[i] - arr[i-1]);
            } else {
                num = 0;
            }

            answer = Math.max(num, answer);
        }

        System.out.println(answer);
    }
}
