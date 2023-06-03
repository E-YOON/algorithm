// 애너그램 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charA = br.readLine().toCharArray();
        char[] charB = br.readLine().toCharArray();
        int[] alpha = new int[26];
        int count = 0;

        for(char c : charA) {
            alpha[c - 97]++;
        }

        for(char c : charB) {
            alpha[c - 97]--;
        }

        for(int i=0; i<alpha.length; i++) {
            if(alpha[i] != 0) {
                count += Math.abs(alpha[i]);
            }    
        }

        System.out.println(count);
    }
}
