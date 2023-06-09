// 연속구간

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0; i<3; i++) {
            String str = br.readLine();
            char now = str.charAt(0);
            int count = 1;
            int max = 1;

            for(int j=1; j<8; j++) {
                char c = str.charAt(j);

                if(now == c) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                    now = c;
                }

                max = Math.max(max, count);
            }

            System.out.println(max);
        }
    }
}
