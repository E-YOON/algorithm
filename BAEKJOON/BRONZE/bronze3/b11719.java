// 그대로 출력하기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
