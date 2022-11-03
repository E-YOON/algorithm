import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[] arr = new int[5];
        int max = 0;
        int cnt = 0;

        for(int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++) {
                int x = Integer.parseInt(st.nextToken());
                arr[i] += x;
            }
            if(max < arr[i]) {
                max = arr[i];
                cnt = i+1;
            }
        }

        System.out.println(cnt + " " + max);
    }
}
