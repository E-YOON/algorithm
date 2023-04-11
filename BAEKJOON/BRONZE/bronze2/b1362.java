import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int idx = 1;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int o = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            if(o == 0 && w == 0) break;

            boolean live = true;

            while(true) {
                st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int n = Integer.parseInt(st.nextToken());

                if(str.equals("#") && n == 0) break;

                if(str.equals("F")) {
                    w += n;
                } else if(str.equals("E")) {
                    w -= n;
                }

                if(w <= 0) {
                    live = false;
                }
            }

            if(live) {
                if((o/2) < w && w < (o*2)) {
                    System.out.println(idx + " :-)");
                } else {
                    System.out.println(idx + " :-(");
                }

            } else {
                System.out.println(idx + " RIP");
            }

            idx++;
        }
    }
}
