import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] guard = new boolean[N][M];
        String[] strArr = new String[M];
        for(int i=0; i<N; i++) {
            strArr = br.readLine().split("");

            for(int j=0; j<M; j++) {
                if(strArr[j].equals("X")) {
                    guard[i][j] = true;
                }
            }
        }

        int NGuard = 0;
        int MGuard = 0;
        boolean hasGurad;

        for(int i=0; i<N; i++) {
            hasGurad = false;
            for(int j=0; j<M; j++) {
                if(guard[i][j]) {
                    hasGurad = true;
                    break;
                }
            }
            if(!hasGurad) {
                NGuard++;
            }
        }
        
        for(int i=0; i<M; i++) {
            hasGurad = false;
            for(int j=0; j<N; j++) {
                if(guard[j][i]) {
                    hasGurad = true;
                    break;
                }
            }
            if(!hasGurad) {
                MGuard++;
            }
        }

        System.out.println(Math.max(NGuard, MGuard));
    }
}
