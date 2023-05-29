// 대표값2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        int avg = (int)list.stream().mapToInt(Integer :: intValue).average().getAsDouble();
        System.out.println(avg);
        System.out.println(list.get(2));
    }
}
