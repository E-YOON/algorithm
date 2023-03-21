public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;
        return answer = s.matches("[0-9]{4}|[0-9]{6}");
    }
}
