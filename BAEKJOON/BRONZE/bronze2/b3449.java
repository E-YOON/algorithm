// 해밍 거리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b3449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            char[] A = br.readLine().toCharArray();
            char[] B = br.readLine().toCharArray();
            int count = 0;

            for(int j=0; j<A.length; j++) {
                if(A[j] != B[j]) {
                    count++;
                }
            }

            System.out.println("Hamming distance is " + count + ".");
        }
    }
}
