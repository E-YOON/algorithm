package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b26575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            Double d = Double.parseDouble(st.nextToken());
            Double f = Double.parseDouble(st.nextToken());
            Double p = Double.parseDouble(st.nextToken());
            System.out.printf("$%.2f\n", d*f*p);
        }

    }
}
