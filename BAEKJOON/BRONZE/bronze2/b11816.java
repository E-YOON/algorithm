// 8진수, 10진수, 16진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X = br.readLine();

        if(X.charAt(1) == 'x') {
            System.out.println(Integer.parseInt(X.substring(2), 16));

        } else if(X.charAt(0) == '0') {
            System.out.println(Integer.parseInt(X.substring(1), 8));

        } else {
            System.out.println(X);
        }
    }
}
