package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b26489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while(true) {
            String str = br.readLine();
            if(str == null) break;
            count++;
        }
        System.out.println(count);
    }
}
