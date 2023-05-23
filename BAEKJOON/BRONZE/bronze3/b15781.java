// 헬멧과 조끼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15781 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int nMax = 0, mMax = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num > nMax) {
                nMax = num;
            }
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num > mMax) {
                mMax = num;
            }
        }

        System.out.println(nMax + mMax);
    }
}
