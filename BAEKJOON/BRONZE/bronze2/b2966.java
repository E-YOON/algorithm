// 찍기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String answer = br.readLine();

        char[] adrian = {'A','B','C','A','B','C','A','B','C','A','B','C'};
        char[] bruno = {'B','A','B','C','B','A','B','C','B','A','B','C'};
        char[] goran = {'C','C','A','A','B','B','C','C','A','A','B','B'};

        int cntA = 0, cntB = 0, cntG = 0;
        int num = 0;

        for(int i=0; i<N; i++) {
            if(num % 12 == 0) {
                num = 0;
            }

            if(answer.charAt(i) == adrian[num]) {
                cntA++;
            }

            if(answer.charAt(i) == bruno[num]) {
                cntB++;
            }

            if(answer.charAt(i) == goran[num]) {
                cntG++;
            }

            num++;
        }

        int max = Math.max(Math.max(cntA, cntB), cntG);
        System.out.println(max);
        if(max == cntA) System.out.println("Adrian");
        if(max == cntB) System.out.println("Bruno");
        if(max == cntG) System.out.println("Goran");
    }
}
