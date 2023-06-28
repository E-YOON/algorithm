// 도비의 영어 공부

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            char lower = st.nextToken().charAt(0);
            
            if(lower == '#') break;

            char upper = Character.toUpperCase(lower);
            int count = 0;

            while(st.hasMoreTokens()) {
                String str = st.nextToken();
                int length = str.length();
                str = str.replaceAll(String.valueOf(lower), "");
                str = str.replaceAll(String.valueOf(upper), "");
                count += length-str.length();
            }

            System.out.println(lower + " " + count);
        }
    }
}
