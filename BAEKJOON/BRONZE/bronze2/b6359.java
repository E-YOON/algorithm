// 만취한 상범

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b6359 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];

            for(int j=2; j<=n; j++) {
                for(int k=1; k<=n; k++) {
                    if(k % j == 0) {
                        if(arr[k] == 0) {
                            arr[k] = 1;
                        } else {
                            arr[k] = 0;
                        }
                    }
                }
            }
            int count = 0;
            for(int j=1; j<arr.length; j++) {
                if(arr[j] == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
