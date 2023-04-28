import java.util.Arrays;

// ~ing
public class 문자열잘라서정렬하기ing {
    public String[] solution(String myString) {
        myString = myString.replace(" ", "");
        String[] answer = myString.trim().split("x+");
        Arrays.sort(answer);
        return answer;
    }
}
