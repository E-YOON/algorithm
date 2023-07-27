// 제로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class s10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        while(K-- > 0) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) {
                stack.pop();
            } else {
                stack.add(num);
            }
        }

        int answer = 0;
        for(int i : stack) {
            answer += i;
        }
        System.out.println(answer);
    }
}
