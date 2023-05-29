// 시험 감독

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        long count = 0;
        
        for(int i=0; i<arr.length; i++) {
            arr[i] -= B;
            count++;

            if(arr[i] > 0) {
                count += arr[i] / C;
                
                if(arr[i] % C > 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
