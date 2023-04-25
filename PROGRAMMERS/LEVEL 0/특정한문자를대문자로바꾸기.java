public class 특정한문자를대문자로바꾸기 {
    public String solution(String my_string, String alp) {
        String answer = "";
        if(my_string.contains(alp)) {
            answer = my_string.replaceAll(alp, alp.toUpperCase());
        } else {
            answer = my_string;
        }
        return answer;
    }
}
