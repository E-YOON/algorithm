import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N > 0) {
            String str = String.valueOf(N);
            str = str.replaceAll("4", "");
            str = str.replaceAll("7", "");

            if(str.equals("")) {
                System.out.println(N);
                break;
            } else {
                --N;
            }
        }
    }
}
