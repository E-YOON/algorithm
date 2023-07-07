// 한조서열정리하고옴ㅋㅋ

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        
        for(int i=0; i<N; i++) {
            int count = 0;

            for(int j=i+1; j<N; j++) {
                if(arr[i] > arr[j]) {
                    count++;
                } else {
                    break;
                }
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
