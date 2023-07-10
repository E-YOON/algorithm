// 롤 케이크

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[L+1];
        int num1 = 0, num2 = 0;
        int max = 0, maxSum = 0;


        StringTokenizer st;
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int sum = 0;

            if(K-P > max) {
                max = K-P;
                num1 = i;
            }

            for(int j=P; j<=K; j++) {
                if(arr[j] == 0) {
                    arr[j] = i;
                    sum++;
                }
            }

            if(sum > maxSum) {
                maxSum = sum;
                num2 = i;
            }
        }

        System.out.println(num1);
        System.out.println(num2);

    }
}
