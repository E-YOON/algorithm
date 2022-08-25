import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int max = 0;
        int prize = 0;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == b && b == c) {
                prize = 10000 + a * 1000;
            } else if(a != b && b != c && a != c) {
                prize = Math.max(a, Math.max(b, c)) * 100;
            } else {
                if(a == b) {
                    prize = 1000 + a * 100;
                } else if(b == c) {
                    prize = 1000 + b * 100;
                } else if(a == c) {
                    prize = 1000 + a * 100;
                }
            }

            if(prize >= max) {
                max = prize;
            }
        }

        System.out.println(max);
    }
}
