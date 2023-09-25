// 성적 통계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class s5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        
        for(int i=0; i<K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            Integer[] arr = new Integer[N];

            for(int j=0; j<N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, Collections.reverseOrder());

            int max = arr[0];
            int min = arr[N-1];
            int gap = 0;

            for(int j=0; j<arr.length-1; j++) {
                gap = Math.max(arr[j] - arr[j+1], gap);
            }

            System.out.println("Class " + (i+1));
            System.out.printf("Max %d, Min %d, Largest gap %d\n", max, min, gap);
        }
    }
}
