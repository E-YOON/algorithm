import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class b1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger p = new BigInteger(st.nextToken());
        BigInteger k = new BigInteger(st.nextToken());
        BigInteger i = new BigInteger("2");

        while(true) {
            if(i.compareTo(k) == -1 && p.remainder(i).compareTo(BigInteger.ZERO) == 0) {
                System.out.println("BAD " + i);
                break;

            } else if(i.compareTo(k) == 0 || i.compareTo(k) == 1) {
                System.out.println("GOOD");
                break;
            }
            
            i = i.add(BigInteger.ONE);

        }
    }
}
