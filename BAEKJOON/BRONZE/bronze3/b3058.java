import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0, min = 100;

            for(int j=0; j<7; j++) {
                int n = Integer.parseInt(st.nextToken());
                if(n%2 == 0) {
                    sum += n;
                    if(n < min) {
                        min = n;
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}
