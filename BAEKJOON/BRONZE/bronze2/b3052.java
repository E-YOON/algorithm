// 나머지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class b3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num % 42);
        }

        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list.size());
    }
}
