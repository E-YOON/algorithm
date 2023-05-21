// 지영 공주님의 마법 거울

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for(int i=0; i<N; i++) {
            str[i] = br.readLine();
        }
        int K = Integer.parseInt(br.readLine());

        if(K == 1) {
            for(int i=0; i<str.length; i++) {
                System.out.println(str[i]);
            }
        } else if(K == 2) {
            for(int i=0; i<str.length; i++) {
                String reverse = "";
                for(int j=str[i].length()-1; j>=0; j--) {
                    reverse += str[i].charAt(j);
                }
                System.out.println(reverse);
            }
        } else if(K == 3) {
            for(int i=str.length-1; i>=0; i--) {
                System.out.println(str[i]);
            }
        } 
    }
}
