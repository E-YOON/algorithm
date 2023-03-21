package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class b27434 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger result = new BigInteger("1");
        if(N <= 1) {
            System.out.println(result);
        } else {
            for(int i=2; i<=N; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            System.out.println(result);
        }

        //ing..
        
    }
}
