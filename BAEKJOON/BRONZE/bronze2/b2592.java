// 대표값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class b2592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        int answer = 0;

        for(int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;

            int count = map.getOrDefault(num, 0) + 1;
            if(count > max) {
                max = count;
                answer = num;
            }

            map.put(num, count);
        }

        System.out.println(sum / 10);
        System.out.println(answer);
    }
}
