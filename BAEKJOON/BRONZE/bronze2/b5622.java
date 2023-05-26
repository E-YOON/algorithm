// 다이얼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int time = 0;
        String[] alpha = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        for(int i=0; i<str.length; i++) {
            for(int j=0; j<alpha.length; j++) {
                if(alpha[j].contains(str[i])) {
                    time += j+3;
                    break;
                }
            }
        }

        System.out.println(time);
    }
}
