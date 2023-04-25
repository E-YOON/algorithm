public class 접미사인지확인하기 {
    public int solution(String my_string, String is_suffix) {
        int answer = my_string.endsWith(is_suffix) ? 1 : 0;
        return answer;
    }
}
