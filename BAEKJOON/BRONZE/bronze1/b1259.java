import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str = br.readLine();

            if(str.equals("0")) break;

            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();

            if(str.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
