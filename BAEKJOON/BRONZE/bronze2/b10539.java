// 수빈이의 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for(int i=0; i<N; i++) {
            A[i] = B[i] * (i+1) - sum;
            sum += A[i];
        }

        for(int n : A) {
            System.out.print(n + " ");
        }
    }
}
