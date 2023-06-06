// 오각형, 오각형, 오각형...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1964 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long answer = 5;
        long add = 7;
        for(int i=1; i<N; i++) {
            answer += add;
            add += 3;
        }
        System.out.println(answer % 45678);
    }
}
