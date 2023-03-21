package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];

        for(int k=0; k<2; k++) {
            for(int i=0; i<A.length; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<A[i].length; j++) {
                    A[i][j] += Integer.parseInt(st.nextToken());
                }
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(A[i][j] + " ");
                if(j == M-1) {
                    System.out.println();
                }
            }
        }
    }
}
