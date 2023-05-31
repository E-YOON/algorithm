// Hashing

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class b15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] c = br.readLine().toCharArray();
        BigInteger hash = new BigInteger("0");

        for(int i=0; i<L; i++) {
            int num = (int)(c[i] - 96);
            hash = hash.add(BigInteger.valueOf(num).multiply(BigInteger.valueOf(31).pow(i)));
        }

        System.out.println(hash.remainder(BigInteger.valueOf(1234567891)));
    }
}
