import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<3; i++) {
            int x = Integer.parseInt(st.nextToken());
            int cnt = 0;

            if(0<x%(A+B) && x%(A+B)<=A) cnt++;
            if(0<x%(C+D) && x%(C+D)<=C) cnt++;

            System.out.println(cnt);
        }
    }
}
