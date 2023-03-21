package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            String answer = "";
            String str = br.readLine();

            answer += str.charAt(0);
            answer += str.charAt(str.length()-1);

            System.out.println(answer);
        }
    }
}
