// 슈퍼 마리오

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        
        for(int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            answer += num;

            if(Math.abs((answer-num)-100) < answer-100) {
                answer -= num;
                break;
            }
        }

        System.out.println(answer);
    }
}
