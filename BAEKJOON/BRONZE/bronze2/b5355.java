// 화성 수학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b5355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String plus = "%";
        String minus = "#";
        String multiple = "@";

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            String str = "";

            while(st.hasMoreTokens()) {
                str = st.nextToken();

                if(str.equals(plus)) {
                    num += 5;
                } else if(str.equals(minus)) {
                    num -= 7;
                } else if(str.equals(multiple)) {
                    num *= 3;
                }
            }

            System.out.printf("%.2f\n", num);
        }
    }
}
