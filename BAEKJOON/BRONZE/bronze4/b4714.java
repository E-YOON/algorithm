import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b4714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double moon = 0.167;

        while(true) {
            double d = Double.parseDouble(br.readLine());

            if(d == -1.0) break;

            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.%n", d, d*moon);
        }
    }
}
