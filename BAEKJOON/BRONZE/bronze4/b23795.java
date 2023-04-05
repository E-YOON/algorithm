import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b23795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        while(true) {
            int money = Integer.parseInt(br.readLine());

            if(money == -1) break;

            answer += money;
        }

        System.out.println(answer);
    }
}
