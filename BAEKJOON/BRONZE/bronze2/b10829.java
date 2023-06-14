// 이진수 변환

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        String binary = Long.toBinaryString(N);
        System.out.println(binary);
    }
}
