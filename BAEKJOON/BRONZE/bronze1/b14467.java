// 소가 길을 건너간 이유 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[11][1];
        for(int i=1; i<11; i++) {
            arr[i][0] = -1;
        }

        int answer = 0;

        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int loca = Integer.parseInt(st.nextToken());

            if(arr[num][0] == -1) {
                arr[num][0] = loca;

            } else {
                if(arr[num][0] != loca) {
                    answer++;
                    arr[num][0] = loca;
                }
            }
        }

        System.out.println(answer);
    }
}
