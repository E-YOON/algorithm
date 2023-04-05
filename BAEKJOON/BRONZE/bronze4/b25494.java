import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b25494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int cnt = 0;

            for(int j=1; j<=a; j++) {
                for(int k=1; k<=b; k++) {
                    for(int l=1; l<=c; l++) {
                        if(j%k == k%l && k%l == l%j && l%j == j%k) cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
