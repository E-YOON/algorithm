import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][15];

        for(int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            for(int j=0; j<15; j++) {
                arr[j][1] = 1;
                arr[0][j] = j;
            }
            
            for(int j=1; j<15; j++) {
                for(int l=2; l<15; l++) {
                    arr[j][l] = arr[j][l-1] + arr[j-1][l];
                }
            }

            System.out.println(arr[k][n]);
        }
    }
}
