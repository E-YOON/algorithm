// 컵홀더

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String str = "";

        for(int i=0; i<n; i++) {
            if(s.charAt(i) == 'S') {
                str += "*S";
            } else {
                str += "*LL";
                i++;
            }
        }
        str += "*";

        int answer = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '*') answer++;
        }

        System.out.println(Math.min(n, answer));
    }
}