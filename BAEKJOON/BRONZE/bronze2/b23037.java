// 5의 수난

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b23037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;

        for(int i=0; i<5; i++) {
            sum += Math.pow(str.charAt(i)-'0', 5);
        }

        System.out.println(sum);
    }
}
