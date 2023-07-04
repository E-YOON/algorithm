// 세로읽기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[5];
        int max = 0;
        for(int i=0; i<list.length; i++) {
            list[i] = br.readLine();
            if(max < list[i].length()) {
                max = list[i].length();
            }
        }

        String answer = "";
        for(int i=0; i<max; i++) {
            for(int j=0; j<list.length; j++) {
                if(i < list[j].length()) {
                    answer += list[j].charAt(i);
                }
            }
        }

        System.out.println(answer);
    }
}
