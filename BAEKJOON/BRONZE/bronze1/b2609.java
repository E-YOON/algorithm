import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int min = (a < b) ? a : b;
        int gcd = 0;

        for(int i=1; i<=min; i++) {
            if(a%i==0 && b%i==0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
        System.out.println(a*b / gcd);
    }
}
