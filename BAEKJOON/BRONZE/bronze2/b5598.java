// 카이사르 암호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cArr = br.readLine().toCharArray();
        String answer = "";

        for(char c : cArr) {

            if(c <= 'C') {
                c = (char)(c+23);
            } else {
                c = (char)(c-3);
            }

            answer += c;
        }

        System.out.println(answer);
    }
}
