// 방 배정

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] female = new int[7];
        int[] male = new int[7];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if(S == 0) {
                female[Y]++;
            } else {
                male[Y]++;
            }
        }

        int count = 0;

        for(int i=1; i<7; i++) {
            if(female[i] != 0) {
                count += female[i] / K;
                if(female[i] % K != 0) {
                    count++;
                }
            }

            if(male[i] != 0) {
                count += male[i] / K;
                if(male[i] % K != 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
