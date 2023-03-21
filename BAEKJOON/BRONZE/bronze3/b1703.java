import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            if(a == 0) break;

            int x = 1;

            for(int i=0; i<a*2; i++) {
                int y = Integer.parseInt(st.nextToken());

                if(i%2 == 0) {
                    x *= y;
                } else {
                    x -= y;
                }
            }

            System.out.println(x);
        }
    }
}
