// 카드게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10801 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[10];
        for(int i=0; i<A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] B = new int[10];
        for(int i=0; i<A.length; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int winA = 0, winB = 0;
        for(int i=0; i<10; i++) {
            if(A[i] > B[i]) {
                winA++;

            } else if(A[i] < B[i]) {
                winB++;
            }
        }

        if(winA == winB) {
            System.out.println("D");
        } else if(winA > winB) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
