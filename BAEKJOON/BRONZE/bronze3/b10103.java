// 주사위 게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int chang = 100;
        int sang = 100;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int changDice = Integer.parseInt(st.nextToken());
            int sangDice = Integer.parseInt(st.nextToken());

            if(changDice > sangDice) {
                sang -= changDice;
            } else if(changDice < sangDice) {
                chang -= sangDice;
            }
        }

        System.out.println(chang);
        System.out.println(sang);
    }
}
