// 진법 변환

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        int result = 0;
        int num = 0;
        int pow = 0;

        for(int i=str.length()-1; i>=0; i--) {
            char c = str.charAt(i);
            
            if('A' <= c && c <= 'Z') {
                num = c - 55;
            } else {
                num = c - '0';
            }

            result += num * Math.pow(N, pow++);
        }

        System.out.println(result);
    }
}
