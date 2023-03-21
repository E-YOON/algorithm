import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bonus = 0;
        int score = 0;

        for(int i=0; i<N; i++){
            String x = st.nextToken();

            if(x.equals("1")){
                bonus++;
                score += bonus;
            } else {
                bonus = 0;
            }
        }

        System.out.println(score);
    }
}
