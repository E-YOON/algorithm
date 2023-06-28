// 창영이의 일기장

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] vowel = {"apa", "epe", "ipi", "opo", "upu"};

        for(int i=0; i<vowel.length; i++) {
            str = str.replaceAll(vowel[i], String.valueOf(vowel[i].charAt(0)));
        }

        System.out.println(str);
    }
}
