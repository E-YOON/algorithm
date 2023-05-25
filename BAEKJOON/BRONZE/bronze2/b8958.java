// OX퀴즈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            String str = br.readLine();
            int sum = 0;
            int countO = 0;

            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    countO++;
                    sum += countO;
                } else {
                    countO = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
