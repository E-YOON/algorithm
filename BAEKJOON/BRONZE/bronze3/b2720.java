import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            int C = Integer.parseInt(br.readLine());
            
            int q = C/25;
            C = C%25;

            int d = C/10;
            C = C%10;

            int n = C/5;
            C = C%5;

            int p = C;
        
            System.out.println(q + " " + d + " " + n + " " + p);
        }
        
    }
}
