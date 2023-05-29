// 거스름돈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 1000 - Integer.parseInt(br.readLine());
        int count = 0;
        int[] change = {500, 100, 50, 10, 5, 1};
        int i = 0;

        while(money != 0) {
            if(money - change[i] >= 0) {
                money -= change[i];
                count++;
            } else {
                i++;
            }
        }

        System.out.println(count);
    }
}
