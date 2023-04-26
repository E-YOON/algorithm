public class 문자열겹쳐쓰기 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            if(i == s) {
                for(int j=s; j<overwrite_string.length(); j++) {
                    answer += overwrite_string.charAt(i)-'0';
                }
                i = my_string.length()-1;
            }
            answer += my_string.charAt(i)-'0';
        }
        return answer;
    }
}
