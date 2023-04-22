import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<C; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int arr[] = new int[N];
            double average = 0;
            double cnt = 0;
            
            for(int j=0; j<N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                average += arr[j];
            }

            average /= (double)N;

            for(int j=0; j<arr.length; j++) {
                if(arr[j] > average) {
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt/N)*100);
        }
    }
}
