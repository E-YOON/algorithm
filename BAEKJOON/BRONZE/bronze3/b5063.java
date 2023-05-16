// TGN

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b5063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int profit = e - c;

            if(r > profit) {
                System.out.println("do not advertise");
            } else if(r == profit) {
                System.out.println("does not matter");
            } else if(r < profit) {
                System.out.println("advertise");
            }
        }
    }
}
