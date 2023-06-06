// 정수의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10821 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(",");
        System.out.println(str.length);
    }
}
