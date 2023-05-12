import java.util.StringTokenizer;

public class JadenCase문자열만들기 {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ", true);
        
        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            char first = str.charAt(0);

            if(first == ' ') {
                answer += " ";
                continue;
            }

            if(Character.isDigit(first)) {
                answer += first;
            } else if(Character.isLowerCase(first)) {
                answer += String.valueOf(first).toUpperCase();
            } else {
                answer += first;
            }

            answer += str.substring(1).toLowerCase();
        }
        
        return answer;
    }
}