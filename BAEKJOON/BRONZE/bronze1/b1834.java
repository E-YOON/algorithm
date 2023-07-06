// 나머지와 몫이 같은 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long answer = (n-1) * (n+1 + (n+1) * (n-1)) / 2;
        
        System.out.println(answer);
    }
}
