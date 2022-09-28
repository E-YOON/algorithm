import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double x = Double.parseDouble(st.nextToken());
            String str = st.nextToken();
            double y = 0;

            if(str.equals("kg")) {
                y = x*2.2046;
                System.out.printf("%.4f lb%n", y);

            } else if(str.equals("lb")) {
                y = x*0.4536;
                System.out.printf("%.4f kg%n", y);

            } else if(str.equals("l")) {
                y = x*0.2642;
                System.out.printf("%.4f g%n", y);

            } else {
                y = x*3.7854;
                System.out.printf("%.4f l%n", y);
            }
        }
    }
}
