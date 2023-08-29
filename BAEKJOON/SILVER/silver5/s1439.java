// 뒤집기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int zero = 0, one = 0;

        if(str[0].equals("0"))
            zero++;
        else
            one++;

        for(int i=1; i<str.length; i++) {
            if(!str[i-1].equals(str[i])) {
                if(str[i].equals("0"))
                    zero++;
                else
                    one++;
            }
        }

        System.out.println(Math.min(zero, one));
    }
}
