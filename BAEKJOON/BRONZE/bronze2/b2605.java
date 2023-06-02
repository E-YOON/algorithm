// 줄 세우기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b2605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);

        for(int i=1; i<=num; i++) {
            int n = Integer.parseInt(st.nextToken());
            list.add(i-n, i);
        }

        for(int i=1; i<=num; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
