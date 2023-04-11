import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int time = 0;
        int timeExer = 0;
        int fir_m = m;

        while(timeExer != N) {
            time++;

            if(m+T <= M) {
                m += T;
                timeExer++;

            } else {
                m -= R;
                if(m < fir_m) m = fir_m;
            }

            if(m+T>M && m==fir_m) {
                break;
            }
        }

        if(timeExer != N) {
            System.out.println(-1);
        } else {
            System.out.println(time);
        }
    }
}
