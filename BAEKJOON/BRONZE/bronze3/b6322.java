import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b6322 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int idx = 1;

        while(true) {
            st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            
            if(a==0 && b==0 && c==0) break;

            System.out.println("Triangle #" + idx);

            //a^2 + b^2 = c^2
            if(a==-1) {
                if(b >= c) {
                    System.out.println("Impossible.");
                } else {
                    a = Math.sqrt((c*c)-(b*b));
                    System.out.printf("a = %.3f\n", a);
                }

            } else if(b==-1) {
                if(a >= c) {
                    System.out.println("Impossible.");
                } else {
                    b = Math.sqrt((c*c)-(a*a));
                    System.out.printf("b = %.3f\n", b);
                }

            } else {
                c = Math.sqrt((a*a) + (b*b));
                System.out.printf("c = %.3f\n", c);
            }

            idx++;
            System.out.println();

        }
    }
}
