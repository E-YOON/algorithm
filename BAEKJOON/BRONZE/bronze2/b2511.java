// 카드놀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[10];
        int[] B = new int[10];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<A.length; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int scoreA = 0, scoreB = 0;
        String winner = "";

        for(int i=0; i<A.length; i++) {
            if(A[i] > B[i]) {
                scoreA += 3;
                winner = "A";

            } else if(A[i] < B[i]) {
                scoreB += 3;
                winner = "B";
                
            } else {
                scoreA += 1;
                scoreB += 1;
            }
        }

        System.out.println(scoreA + " " + scoreB);
        if(scoreA == scoreB) {
            System.out.println(winner.length() == 0 ? "D" : winner);
        } else {
            System.out.println(scoreA > scoreB ? "A" : "B" );
        }
    }
}
