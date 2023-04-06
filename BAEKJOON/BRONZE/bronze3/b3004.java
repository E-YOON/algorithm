import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b3004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int piece = 1;
        int cut = 1;

        for(int i=0; i<N; i++) {
            if(i%2 != 0) {
                cut += 1;
            }

            piece += cut;
        }

        System.out.println(piece);
    }
}
