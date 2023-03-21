import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        
        double max = 0;
        int cnt = 0;
        double[] arr = {
                ((double)A / C) + ((double)B / D),
                ((double)C / D) + ((double)A / B),
                ((double)D / B) + ((double)C / A),
                ((double)B / A) + ((double)D / C)
        };

        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                cnt = i;
            }
        }

        System.out.println(cnt);
    }
}
