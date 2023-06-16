// 트로피 진열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1668 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int left = 1;
        int max = arr[0];
        for(int i=1; i<N; i++) {
            if(arr[i] > max) {
                left++;
                max = arr[i];
            }
        }

        int right = 1;
        max = arr[N-1];
        for(int i=N-2; i>=0; i--) {
            if(arr[i] > max) {
                right++;
                max = arr[i];
            }
        }

        System.out.println(left);
        System.out.println(right);
    }
}
