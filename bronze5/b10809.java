package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        for(int i=97; i<123; i++) {
            char c = (char)i;
            System.out.println(S.indexOf(String.valueOf(c)));
        }
    }
}
