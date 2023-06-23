// 좋은 자동차 번호판

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), "-");
            String first = st.nextToken();
            int second = Integer.parseInt(st.nextToken());
            int firstSum = 0;

            for(int j=0; j<first.length(); j++) {
                int num = first.charAt(j) - 'A';
                firstSum += num * Math.pow(26, 2-j);
            }

            if(Math.abs(firstSum-second) < 100) {
                System.out.println("nice");
            } else {
                System.out.println("not nice");
            }

        }
    }
}
