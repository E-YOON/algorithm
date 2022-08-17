import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class b1247 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0; i<3; i++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger compare = new BigInteger("0");
            BigInteger s = new BigInteger("0");

            for(int j=0; j<n; j++) {
                BigInteger x = new BigInteger(br.readLine());
                s = s.add(x);
            }
            
            if(s.compareTo(compare) == 0) {
                System.out.println("0");
            } else if(s.compareTo(compare) == 1) {
                System.out.println("+");
            } else if(s.compareTo(compare) == -1) {
                System.out.println("-");
            }
        }
        
    }
}
