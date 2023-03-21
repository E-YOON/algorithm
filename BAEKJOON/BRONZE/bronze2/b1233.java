package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        int s3 = Integer.parseInt(st.nextToken());

        int[] arr = new int[s1 * s2 * s3];

        for(int i=1; i<=s1; i++) {
            for(int j=1; j<=s2; j++) {
                for(int k=1; k<=s3; k++) {
                    arr[i+j+k]++;
                }
            }
        }

        int max = 0;
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(index);

    }
}
