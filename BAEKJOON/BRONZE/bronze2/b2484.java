// 주사위 네개 ~ing

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2484 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] dice = new int[4];
            for(int j=0; j<4; j++) {
                dice[j] = Integer.parseInt(st.nextToken());
            }



        }
    }
}
