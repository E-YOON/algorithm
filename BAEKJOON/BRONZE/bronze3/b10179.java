// 쿠폰

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            double d = Double.parseDouble(br.readLine());
            System.out.printf("$%.2f\n", d - (d*0.2));
        }
    }
}
