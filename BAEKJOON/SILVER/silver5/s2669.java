// 직사각형 네 개의 합집합의 면적 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s2669 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int answer = 0;
        boolean[][] arr = new boolean[101][101];

        for(int i=0; i<4; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j=x1; j<x2; j++) {
                for(int k=y1; k<y2; k++) {
                    arr[j][k] = true;
                }
            }
        }

        for(int i=0; i<101; i++) {
            for(int j=0; j<101; j++) {
                if(arr[i][j] == true) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
