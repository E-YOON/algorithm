// Baseball

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int yScore = 0, kScore = 0;

        for(int i=0; i<T; i++) {
            for(int j=0; j<9; j++) {
                st = new StringTokenizer(br.readLine());
                yScore += Integer.parseInt(st.nextToken());
                kScore += Integer.parseInt(st.nextToken());
            }

            if(yScore > kScore) {
                System.out.println("Yonsei");
            } else if(yScore < kScore) {
                System.out.println("Korea");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
