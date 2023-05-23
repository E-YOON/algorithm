// 지각

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int d = Integer.parseInt(br.readLine());
            int t = 1;
            while((t*t) + t <=d) {
                t++;
            }
            System.out.println(t-1);
        }
    }
}
