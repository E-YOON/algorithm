// 주사위 네개

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2484 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int maxPrice = 0;

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] dice = new int[4];
            for(int j=0; j<4; j++) {
                dice[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(dice);
            int price = 0;

            if(dice[0] == dice[3]) {
                price = 50000 + dice[0] * 5000;

            } else if(dice[0] == dice[2] || dice[1] == dice[3]) {
                price = 10000 + dice[1] * 1000;

            } else if(dice[0] == dice[1] && dice[2] == dice[3]) {
                price = 2000 + dice[1] * 500 + dice[2] * 500;

            } else if(dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) {
                int same = dice[2] == dice[3] ? dice[2] : dice[1];
                price = 1000 + same * 100;
            
            } else {
                price = 100 * dice[3];
            }

            maxPrice = maxPrice < price ? price : maxPrice;
        }

        System.out.println(maxPrice);
    }
}
