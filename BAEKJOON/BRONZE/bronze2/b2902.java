// KMP는 왜 KMP일까?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("-");

        String answer = "";
        for(String s : str) {
            answer += s.charAt(0);
        }
        System.out.println(answer);
    }
}
