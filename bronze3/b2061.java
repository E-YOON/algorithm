import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class b2061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger K = new BigInteger(st.nextToken());
        BigInteger L = new BigInteger(st.nextToken());

        for(int i=2; i<L.intValue(); i++) {
            if(K.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO)==0) {
                System.out.println("BAD " + i);
                return;
            }
        }

        System.out.println("GOOD");
    }
}
