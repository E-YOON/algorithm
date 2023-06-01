// 막대기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int criteria = arr[N-1];
        int count = 1;

        for(int i=N-2; i>=0; i--) {
            if(arr[i] > criteria) {
                count++;
                criteria = arr[i];
            }
        }

        System.out.println(count);
    }
}
