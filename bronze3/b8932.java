import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b8932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<T; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<7; j++) {
                int P = Integer.parseInt(st.nextToken());
                double score = 0;

                switch (j) {
                    case 0: score = 9.23076 * Math.pow((26.7 - P), 1.835);
                        sum += score;
                        break;
                    
                    case 1: score = 1.84523 * Math.pow((P - 75), 1.348);
                        sum += score;
                        break;

                    case 2: score = 56.0211 * Math.pow((P - 1.5), 1.05);
                        sum += score;
                        break;

                    case 3: score = 4.99087 * Math.pow((42.5 - P), 1.81);
                        sum += score;
                        break;

                    case 4: score = 0.188807 * Math.pow((P - 210), 1.41);
                        sum += score;
                        break;

                    case 5: score = 15.9803 * Math.pow((P - 3.8), 1.04);
                        sum += score;
                        break;

                    case 6: score = 0.11193 * Math.pow((254 - P), 1.88);
                        sum += score;
                        break;
                }
            }

            System.out.println(sum);
        }
    }
}
