// 직사각형을 만드는 방법

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b8320 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=1; i<=n; i++) {
            for(int j=i; i*j<=n; j++) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
