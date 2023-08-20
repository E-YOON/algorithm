// 막대기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int stick = 64;
        int count = 0;

        while(X > 0) {
            if(X < stick) {
                stick /= 2;
                
            } else {
                count++;
                X -= stick;
            }
        }

        System.out.println(count);
    }
}
