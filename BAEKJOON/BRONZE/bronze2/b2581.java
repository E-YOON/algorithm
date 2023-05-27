// 소수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i=M; i<=N; i++) {
            if(isPrime(i)) {
                sum += i;
                if(min > i) {
                    min = i;
                }
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
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
