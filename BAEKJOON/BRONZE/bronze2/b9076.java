// 점수 집계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b9076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<T; i++) {
            int[] arr = new int[5];
            st = new StringTokenizer(br.readLine());
            
            for(int j=0; j<5; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            if(arr[3]-arr[1] >= 4) {
                System.out.println("KIN");
            } else {
                System.out.println(arr[1] + arr[2] + arr[3]);
            }
        }
    }
}
