// 간지(干支)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b7572 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] gan = {'0', '1', '2', '3', '4', '5', '6', '7', '8','9'};
        char[] zi = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};

        int a = (N + 56) % 60;
        int g = 0;
        int z = 0;
        for(int i = 0; i < a; i++){
            if(g == 9) {
                g = 0;
            } else {
                g++;
            }

            if(z == 11) {
                z = 0;
            } else {
                z++;
            }
        }

        System.out.println(zi[z] + "" + gan[g]);
    }
}
