import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        double x = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));

        for(int i=0; i<N; i++) {
            int y = Integer.parseInt(br.readLine());
            if(y <= x) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
