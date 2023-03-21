import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        answer = new StringBuilder(new String(c)).reverse().toString();
        return answer;
    }
}
