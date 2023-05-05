import java.util.Arrays;

public class 문자열잘라서정렬하기 {
    public String[] solution(String myString) {
        String[] answer = myString.replaceAll("x+", " ").trim().split(" ");
        Arrays.sort(answer);
        return answer;
    }
}
