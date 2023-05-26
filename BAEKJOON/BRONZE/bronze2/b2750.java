// 수 정렬하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class b2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list.stream().sorted().forEach(num -> System.out.println(num));
    }
}
