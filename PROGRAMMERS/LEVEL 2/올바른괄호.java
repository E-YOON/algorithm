import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        if(s.length() % 2 != 0 || s.charAt(0) == ')') {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(c);
            } else {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        if(stack.size() > 0) {
            return false;
        }

        return true;
    }
}
