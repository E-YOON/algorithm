// N번째 큰 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<T; i++) {
            int[] A = new int[10];
            st = new StringTokenizer(br.readLine());
            
            for(int j=0; j<10; j++) {
                A[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(A);

            System.out.println(A[7]);
        }
    }
}
