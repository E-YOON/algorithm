// 상수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        StringBuffer sb = new StringBuffer(A);
        String reverseA = sb.reverse().toString();
        sb = new StringBuffer(B);
        String reverseB = sb.reverse().toString();

        System.out.println(Integer.parseInt(reverseA) > Integer.parseInt(reverseB) ? reverseA : reverseB);
    }
}
