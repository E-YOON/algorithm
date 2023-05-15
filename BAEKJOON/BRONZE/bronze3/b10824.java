// 네 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        Long ab = Long.parseLong(str[0] + str[1]);
        Long cd = Long.parseLong(str[2] + str[3]);

        System.out.println(ab + cd);
    }
}
