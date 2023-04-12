import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cnt = new int[26];
        Arrays.fill(cnt, 0);
        String str;

        while((str = br.readLine()) != null) {
            str = str.replaceAll(" ", "");
            char[] strChar = str.toCharArray();

            for(int i=0; i<strChar.length; i++) {
                int idx = (byte)strChar[i] - 97;
                cnt[idx]++;
            }
        }

        int max = 0;
        for(int i=0; i<cnt.length; i++) {
            if(max < cnt[i]) {
                max = cnt[i];
            }
        }

        for(int i=0; i<cnt.length; i++) {
            if(max == cnt[i]) {
                System.out.print((char)(i + 97));
            }
        }
    }
}
