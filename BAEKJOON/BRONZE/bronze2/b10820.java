// 문자열 분석

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while((str = br.readLine()) != null) {
            int[] arr = new int[4];

            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);

                if('a' <= c && c <= 'z') {
                    arr[0]++;
                }

                if('A' <= c && c <= 'Z') {
                    arr[1]++;
                }

                if('0' <= c && c <= '9') {
                    arr[2]++;
                }

                if(c == ' ') {
                    arr[3]++;
                }
            }

            String s = "";
            for(int i : arr) {
                s += i + " ";
            }

            System.out.println(s.trim());
        }
    }
}
