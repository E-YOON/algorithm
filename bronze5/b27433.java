package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long answer = fact(N);
        System.out.println(answer);
    }

    public static long fact(long num) {
        if(num <= 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}
