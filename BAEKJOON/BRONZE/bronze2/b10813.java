// 공 바꾸기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            list.add(i);
        }

        for(int k=0; k<M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            Collections.swap(list, i-1, j-1);
        }

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));

            if(i==list.size()) {
                break;
            } else {
                System.out.print(" ");
            }
        }
    }
}
