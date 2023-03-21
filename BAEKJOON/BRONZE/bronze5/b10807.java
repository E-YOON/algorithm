package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = str.split(" ");
        String v = br.readLine();
        int count = 0;

        for(String x : arr) {
            if(x.equals(v))
                count++;
        }

        System.out.println(count);
    }
}
