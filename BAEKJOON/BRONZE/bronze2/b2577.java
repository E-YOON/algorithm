// 숫자의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        String str = String.valueOf(A * B * C);

        for(int i=0; i<str.length(); i++) {
            arr[str.charAt(i)-'0']++;
        }

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
