// 거리의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sum += Math.abs(arr[i]-arr[j]);
            }
        }
        
        System.out.println(sum);
    }
}
