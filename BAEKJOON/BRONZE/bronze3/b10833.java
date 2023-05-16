// 사과

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10833 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int rest = 0;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            int apples = Integer.parseInt(st.nextToken());

            while(students <= apples) {
                apples -= students;
            }

            rest += apples;
        }

        System.out.println(rest);
    }
}
