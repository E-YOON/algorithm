import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b16199 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());   
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        int year1;

        if(a == x) {
            year1 = x-a;
        } else {
            if(b > y) {
                year1 = x-a-1;
            } else if(b == y) {
                if(c <= z) {
                    year1 = x-a;
                } else {
                    year1 = x-a-1;
                }
            } else {
                year1 = x-a;
            }
        }

        System.out.println(year1);
        System.out.println(x-a+1);
        System.out.println(x-a);
    }
}
