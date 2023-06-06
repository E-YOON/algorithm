// 럭키 스트레이트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int mid = N.length() / 2;
        String front = N.substring(0, mid);
        String end = N.substring(mid);

        int f = 0, e = 0;

        for(int i=0; i<mid; i++) {
            f += front.charAt(i);
            e += end.charAt(i);
        }

        if(f == e) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
