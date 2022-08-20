import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<N; i++) {
            int a = Integer.parseInt(br.readLine());
            count += a;
        }

        System.out.println(count-(N-1));
    }
}
