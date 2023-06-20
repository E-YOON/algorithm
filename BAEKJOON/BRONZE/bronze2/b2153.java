// 소수 단어

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        int num = 0;
        boolean not = false;

        for(int i=0; i<word.length; i++) {
            if(Character.isLowerCase(word[i])) {
                num += (int)word[i] - 96;
            } else {
                num += (int)word[i] - 38;
            }
        }

        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                not = true;
                break;
            }
        }

        if(not) {
            System.out.println("It is not a prime word.");
        } else {
            System.out.println("It is a prime word.");
        }
    }
}
