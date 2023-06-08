// JOI와 IOI

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int countJOI = 0, countIOI = 0;

        for(int i=0; i<str.length()-2; i++) {
            if(str.charAt(i) == 'J') {
                if(str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I') {
                    countJOI++;
                }

            } else if(str.charAt(i) == 'I') {
                if(str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I') {
                    countIOI++;
                }
            }
        }

        System.out.println(countJOI);
        System.out.println(countIOI);
    }
}
