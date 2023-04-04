import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b27918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            if(str.equals("D")) {
                ++x;
            } else {
                ++y;
            }

            if(Math.abs(x-y) >= 2) break;
        }

        System.out.println(x + ":" + y);
    }
}
