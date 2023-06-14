// 공약수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b5618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = 0, y = 0, z = 0;

        if(n == 2) {
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            int min = Math.min(x, y);

            for(int i=1; i<=min; i++) {
                if(x%i==0 && y%i==0) {
                    System.out.println(i);
                }
            }

        } else {
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());
            int min = Math.min(x, Math.min(y, z));

            for(int i=1; i<=min; i++) {
                if(x%i==0 && y%i==0 && z%i==0) {
                    System.out.println(i);
                }
            }
        }
    }
}
