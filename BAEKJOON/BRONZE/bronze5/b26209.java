package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b26209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());;
        boolean b = true;
        for(int i=0; i<8; i++) {
            int N = Integer.parseInt(st.nextToken());
            if(N != 0 && N != 1) {
                b = false;
                break;
            }
        }

        System.out.println(b==true ? "S" : "F");
    }
    
}