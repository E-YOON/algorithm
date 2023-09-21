// 알고리즘 수업 - 점근적 표기 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int num1 = a1 * n + a0;
        int num2 = c * n;

        if(num1 <= num2 && a1 <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
