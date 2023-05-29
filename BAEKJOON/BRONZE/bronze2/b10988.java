// 팰린드롬인지 확인하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        System.out.println(str.equals(reverse) ? 1 : 0);
    }
}
