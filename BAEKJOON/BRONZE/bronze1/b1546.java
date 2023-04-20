import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0.0;
        double[] score = new double[N];
        double answer = 0.0;
        for(int i=0; i<N; i++) {
            int a = Integer.parseInt(st.nextToken());
            score[i] = a;
            if(a > max) {
                max = a;
            }
        }

        for(int i=0; i<score.length; i++) {
            answer += score[i]/max * 100;
        }

        System.out.println(answer/(double)N);
    }
}
