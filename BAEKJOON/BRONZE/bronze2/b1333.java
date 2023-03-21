package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b1333 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   //N곡
        int L = Integer.parseInt(st.nextToken());   //L초
        int D = Integer.parseInt(st.nextToken());
        
        ArrayList<Integer> list = new ArrayList<>();
        int time = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<L; j++) {
                list.add(1);
            }

            if(i != N-1) {
                for(int j=0; j<5; j++) {
                    list.add(0);
                }
            }
        }

        while(time < list.size()) {
            if(list.get(time) == 0) {
                break;
            }
            time += D;
        }
        System.out.println(time);
    }
}
