import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b4619 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int A = 1, x = 0, y = 0;
            if(B==0 && N==0) break;

            while(true) {
                if(B >= Math.pow(A, N)) {
                    x = A;
                } else if(B < Math.pow(A, N)) {
                    y = A;
                    break;
                }

                A++;
            }

            if(Math.abs(Math.pow(x, N)-B) > Math.abs(Math.pow(y, N)-B))
                System.out.println(y);
            else 
                System.out.println(x);
        }
    }
}
