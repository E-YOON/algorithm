import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b17863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N/10000 == 555) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
