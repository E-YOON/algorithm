import java.util.Arrays;

public class 문자열정렬하기1 {
    public int[] solution(String str) {
        String num = "";
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(48 <= c && c <= 57) {
                num += c;
            }
        }
        int[] answer = new int[num.length()];
        for(int i=0; i<num.length(); i++) {
            answer[i] = (int)num.charAt(i)-'0';
        }
        Arrays.sort(answer);
        return answer;
    }
}
