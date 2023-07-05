// 알고리즘 수업 - 피보나치 수 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b24416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(fibonacci(n) + " " + (n-2));
    }

    public static int fibonacci(int n) {
        int[] f = new int[n+1];
        f[1] = 1;
        f[2] = 1;

        for(int i=3; i<=n; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }
}
