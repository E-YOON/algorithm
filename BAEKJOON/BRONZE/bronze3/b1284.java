import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1284 {
    public static final int one = 3;    //여백 포함 3
    public static final int zero = 5;   //여백 포함 5
    public static final int other = 4;  //여백 포함 4
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String str = br.readLine();
            int sum = 1;
            if(str.equals("0")) break;

            for(int i=0; i<str.length(); i++) {
                String a = str.substring(i, i+1);
                if(a.equals("1")) {
                    sum += one;
                } else if(a.equals("0")) {
                    sum += zero;
                } else {
                    sum += other;
                }
            }

            System.out.println(sum);
        }
    }
}
