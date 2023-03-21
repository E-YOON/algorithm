import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b9325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            int s = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int price = 0;

            if(n != 0) {
                for(int j=0; j<n; j++) {
                    st = new StringTokenizer(br.readLine());
                    int q = Integer.parseInt(st.nextToken());
                    int p = Integer.parseInt(st.nextToken());
                    price += q*p;
                }
            }
            System.out.println(s + price);
        }
    }
}
