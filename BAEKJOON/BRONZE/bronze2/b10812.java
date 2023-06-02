// 바구니 순서 바꾸기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b10812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            list.add(i);
        }

        for(int l=0; l<M; l++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) -1;
            int j = Integer.parseInt(st.nextToken()) -1;
            int k = Integer.parseInt(st.nextToken()) -1;

            int num = list.get(i);
            int end = list.get(k);

            while(num != end) {
                list.add(j+1, num);
                list.remove(i);
                num = list.get(i);
            }
        }

        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}
