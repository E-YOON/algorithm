public class 세개의구분자 {
    public String[] solution(String myStr) {
        String[] answer = myStr.replaceAll("a|b|c", " ").trim().split("\\s+");
        if(answer[0].equals("")) {
            answer[0] = "EMPTY";
        }
        return answer;
    }
}
