import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 논리학 교수
public class b1813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[51];

        for(int i=0; i<N; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[a]++;
        }

        for(int i=N; i>=0; i--) {
            if(arr[i] == i) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
