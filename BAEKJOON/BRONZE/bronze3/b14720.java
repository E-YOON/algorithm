// 우유 축제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b14720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int count = 0;
        String next = "0";

        for(int i=0; i<N; i++) {
            if(str[i].equals(next) && next.equals("0")) {
                count++;
                next = "1";
                continue;
            }

            if(str[i].equals(next) && next.equals("1")) {
                count++;
                next = "2";
                continue;
            }

            if(str[i].equals(next) && next.equals("2")) {
                count++;
                next = "0";
                continue;
            }
        }

        System.out.println(count);
    }
}
