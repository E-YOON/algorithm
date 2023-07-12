import java.util.Stack;

public class 괄호회전하기 {
    public int solution(String s) {
        int answer = 0;
        if(check(s)) answer++;

        for(int j=1; j<s.length(); j++) {
            s = s.substring(1) + s.charAt(0);
            if(check(s)) answer++;
            System.out.println("s : " + s + ", answer : " + answer);
        }
        
        return answer;
    }

    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));

            } else {
                if(!stack.isEmpty()) {
                    if(s.charAt(i) == ']') {
                        if(stack.peek() == '[') {
                            stack.pop();
                        }

                    } else if(s.charAt(i) == '}') {
                        if(stack.peek() == '{') {
                            stack.pop();
                        }

                    } else if(s.charAt(i) == ')') {
                        if(stack.peek() == '(') {
                            stack.pop();
                        }
                    } 

                } else {
                    stack.push(s.charAt(i));
                }
            }
        }

        return stack.empty();
    }
}
