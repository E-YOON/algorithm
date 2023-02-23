package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b26307 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int HH = Integer.parseInt(st.nextToken());
        int MM = Integer.parseInt(st.nextToken());

        System.out.println((HH-9)*60 + MM);
    }
}
