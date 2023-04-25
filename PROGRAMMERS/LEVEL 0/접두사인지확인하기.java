public class 접두사인지확인하기 {
    public int solution(String my_string, String is_prefix) {
        if(my_string.length() < is_prefix.length()) {
            return 0;
        }

        String prefix = my_string.substring(0, is_prefix.length());
        int answer = prefix.equals(is_prefix) ? 1 : 0;
        return answer;
    }
}
