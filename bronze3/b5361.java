import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b5361 {
    final static double A_PRIZE = 350.34;
    final static double B_PRIZE = 230.90;
    final static double C_PRIZE = 190.55;
    final static double D_PRIZE = 125.30;
    final static double E_PRIZE = 180.90;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            double A = Double.parseDouble(st.nextToken());
            double B = Double.parseDouble(st.nextToken());
            double C = Double.parseDouble(st.nextToken());
            double D = Double.parseDouble(st.nextToken());
            double E = Double.parseDouble(st.nextToken());
            double sum = 0;

            sum = (A*A_PRIZE) + (B*B_PRIZE) + (C*C_PRIZE) + (D*D_PRIZE) + (E*E_PRIZE);

            System.out.printf("$%.2f\n",sum);
        }
    }
}
