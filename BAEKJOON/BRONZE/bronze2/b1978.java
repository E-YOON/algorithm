// 소수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)) count++;
        }

        System.out.println(count);
    }

    public static boolean isPrime(int num) {

        if(num < 2) {
            return false;
        }

        if(num == 2) {
            return true;
        }

        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
