// 크로아티아 알파벳

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i=0; i<alpha.length; i++) {
            str = str.replace(alpha[i], "1");
        }

        System.out.println(str.length());
    }
}
