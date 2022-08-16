import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b16486 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        double pi = 3.141592;
        System.out.println(d1*2 + 2*pi*d2);
    }
}
