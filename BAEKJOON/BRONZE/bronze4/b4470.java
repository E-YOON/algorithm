import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            System.out.println((i+1) + ". " + str);
        }
    }
}