// 수 뒤집기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b3062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String N = br.readLine();
            StringBuffer sb = new StringBuffer(N);
            String reverseN = sb.reverse().toString();

            String sum = String.valueOf(Integer.parseInt(N) + Integer.parseInt(reverseN));
            sb = new StringBuffer(sum);
            String reverseSum = sb.reverse().toString();

            if(sum.equals(reverseSum)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
