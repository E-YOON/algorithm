import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        while(true) {
            String str = br.readLine();

            if(str.equals("#")) break;
            int count = 0;

            for(int i=0; i<vowel.length; i++) {
                for(int j=0; j<str.length(); j++) {
                    if(str.charAt(j) == vowel[i]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}