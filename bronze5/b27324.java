package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b27324 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.charAt(0) == str.charAt(1)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
