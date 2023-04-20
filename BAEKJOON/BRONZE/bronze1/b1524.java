import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int NMax = 0;
            int MMax = 0;

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                int NPower = Integer.parseInt(st.nextToken());
                if(NPower > NMax) {
                    NMax = NPower;
                }
            }

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                int MPower = Integer.parseInt(st.nextToken());
                if(MPower > MMax) {
                    MMax = MPower;
                }
            }

            if(NMax > MMax) {
                System.out.println("S");
            } else if(NMax < MMax) {
                System.out.println("B");
            } else {
                System.out.println("S");
            }
        }
    }
}
