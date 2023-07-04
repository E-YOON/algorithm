// ROT13

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        for(int i=0; i<c.length; i++) {
            if(Character.isLowerCase(c[i])) {
                int num = c[i] + 13;
                if(num > 122) num -= 26;
                System.out.print((char)num);

            } else if(Character.isUpperCase(c[i])) {
                int num = c[i] + 13;
                if(num > 90) num -= 26;
                System.out.print((char)num);

            } else {
                System.out.print(c[i]);
            }
        }
    }
}
