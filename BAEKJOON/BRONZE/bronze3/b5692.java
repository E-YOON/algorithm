import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5692 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) break;

            int decimal = 0;
            int index = 1;

            while(num > 0) {
                int x = num%10;
                num /= 10;

                decimal += x * fact(index);

                index++;
            }

            System.out.println(decimal);
        }
    }

    public static int fact(int n) {
        if(n <= 1)
            return n;
        else
            return fact(n-1) * n;
    }
}
