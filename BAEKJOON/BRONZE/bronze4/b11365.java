import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb;

        while(true) {
            String str = br.readLine();

            if(str.equals("END")) break;

            sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();

            System.out.println(reverse);
        }
    }
}
