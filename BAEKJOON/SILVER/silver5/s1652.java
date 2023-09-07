// 누울 자리를 찾아라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] arr = new char[N][N];
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int width = 0;
        int height = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {

                // 가로
                if(j+1 < N) {
                    if(arr[i][j] == '.' && arr[i][j+1] == '.' && (j+2 >= N || arr[i][j+2] == 'X')) {
                        width++;
                    }   
                }
                
                // 세로
                if(i+1 < N) {
                    if(arr[i][j] == '.' && arr[i+1][j] == '.' && (i+2 >= N || arr[i+2][j] == 'X'))  {
                        height++;
                    }
                }
            }
        }

        System.out.println(width + " " + height);
    }
}
