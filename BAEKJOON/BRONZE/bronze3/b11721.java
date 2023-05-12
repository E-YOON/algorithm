// 열 개씩 끊어 출력하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        while(str.length() > 9) {
            System.out.println(str.substring(0, 10));
            str = str.substring(10, str.length());
        }

        System.out.print(str);
    }
}
