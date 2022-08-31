import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class b2547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            String str = br.readLine(); //빈 줄
            BigInteger candy = new BigInteger("0");
            BigInteger N = new BigInteger(br.readLine());

            for(int j=0; j<N.intValue(); j++) {
                BigInteger x = new BigInteger(br.readLine());
                candy = candy.add(x);
            }

            if(candy.remainder(N).compareTo(BigInteger.ZERO) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
