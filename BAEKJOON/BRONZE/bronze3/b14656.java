// 조교는 새디스트야!!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b14656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for(int i=1; i<=N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(i != num) {
                count++;
            }
        }

        System.out.println(count);
    }
}
