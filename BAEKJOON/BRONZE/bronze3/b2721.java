import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());

            int answer = 0;

            for(int j=1; j<=n; j++) {
                int k = sumT(j + 1);
                answer += j * k;
            }

            System.out.println(answer);
        }
    }

    public static int sumT(int t) {
        int sum = 0;
        for(int i=1; i<=t; i++) {
            sum += i;
        }
        return sum;
    }
}
