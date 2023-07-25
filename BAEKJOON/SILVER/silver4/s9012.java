// 괄호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String str = br.readLine();

            while(str.contains("()")) {
                str = str.replaceAll("\\(\\)", "");
            }

            if(str.length() == 0 || str == "") {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
