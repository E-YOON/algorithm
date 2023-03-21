public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        int idx = s.length()/2;
        char[] c = s.toCharArray();
        if(s.length()%2!=0) {
            answer += c[idx];
        } else {
            answer += c[idx-1];
            answer += c[idx];
        }
        return answer;
    }
}
