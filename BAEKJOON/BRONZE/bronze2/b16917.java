// 양념 반 후라이드 반

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b16917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int priceAB = A + B;
        int priceC = C + C;
        long answer = 0;

        if(priceAB > priceC) {
            if(X > Y) {
                answer += Y * priceC;
                answer += Math.min((X-Y)*A, (X-Y)*priceC);

            } else {
                answer += X * priceC;
                answer += Math.min((Y-X)*B, (Y-X)*priceC);
            }

        } else {
            answer += A*X;
            answer += B*Y;
        }

        System.out.println(answer);
    }
}
