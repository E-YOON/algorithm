import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String X = st.nextToken();
        String Y = st.nextToken();

        String revX = rev(X);
        String revY = rev(Y);
        int sum = Integer.parseInt(revX) + Integer.parseInt(revY);
        String answer = rev(String.valueOf(sum));

        System.out.println(Integer.parseInt(answer));
    }

    public static String rev(String a) {
        StringBuffer sb = new StringBuffer(a);
        return sb.reverse().toString();
    }
}
