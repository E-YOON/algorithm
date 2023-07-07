// 딱지놀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b14696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++) {
            int[] countA = new int[5];
            int[] countB = new int[5];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());

            for(int j=0; j<count; j++) {
                int num = Integer.parseInt(st.nextToken());
                countA[num]++;
            }

            st = new StringTokenizer(br.readLine());
            count = Integer.parseInt(st.nextToken());

            for(int j=0; j<count; j++) {
                int num = Integer.parseInt(st.nextToken());
                countB[num]++;
            }

            String winner = "";

            if(countA[4] != countB[4]) {
                if(countA[4] > countB[4]) {
                    winner = "A";
                } else {
                    winner = "B";
                }
            }

            if(countA[3] != countB[3] && countA[4] == countB[4]) {
                if(countA[3] > countB[3]) {
                    winner = "A";
                } else {
                    winner = "B";
                }
            }

            if(countA[2] != countB[2] && countA[4] == countB[4] && countA[3] == countB[3]) {
                if(countA[2] > countB[2]) {
                    winner = "A";
                } else {
                    winner = "B";
                }
            }

            if(countA[1] != countB[1] && countA[4] == countB[4] && countA[3] == countB[3] && countA[2] == countB[2]) {
                if(countA[1] > countB[1]) {
                    winner = "A";
                } else {
                    winner = "B";
                }
            }

            if(countA[1] == countB[1] && countA[2] == countB[2] && countA[3] == countB[3] && countA[4] == countB[4]) {
                winner = "D";
            }
            

            System.out.println(winner);
        }
    }
}
