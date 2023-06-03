// 유학 금지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = {"C", "A", "M", "B", "R", "I", "D", "G", "E"};

        for(int i=0; i<strArr.length; i++) {
            if(str.contains(strArr[i])) {
                str = str.replaceAll(strArr[i], "");
            }
        }

        System.out.println(str);
    }
}
