import java.util.Arrays;

public class 문자열정렬하기2 {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.toLowerCase().split("");
        Arrays.sort(str);
        for(int i=0; i<str.length; i++) {
            answer += str[i];
        }
        return answer;
    }
}
