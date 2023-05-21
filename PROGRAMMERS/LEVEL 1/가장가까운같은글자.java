import java.util.Arrays;

public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()-1];
        Arrays.fill(answer, -1);

        for(int i=1; i<s.length(); i++) {
            char c = s.charAt(i);
            for(int j=0; j<i; j++) {
                if(s.charAt(j) == c) {
                    answer[i] = i - j;
                }
            }
        }

        return answer;
    }
}
