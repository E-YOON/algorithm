// 내 학점을 구해줘

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int credit = 0;
            double avg = 0;

            for(int j=0; j<N; j++) {
                st = new StringTokenizer(br.readLine());
                int C = Integer.parseInt(st.nextToken());
                Double G = Double.parseDouble(st.nextToken());
                credit += C;
                avg += C * G;
            }

            System.out.println(credit + " " + Math.round(avg*10/credit)/10.0);
        }
    }
}
