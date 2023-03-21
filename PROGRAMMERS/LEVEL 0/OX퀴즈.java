import java.util.StringTokenizer;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++) {
            StringTokenizer st = new StringTokenizer(quiz[i]);
            int x = Integer.parseInt(st.nextToken());
            String oper = st.nextToken();
            int y = Integer.parseInt(st.nextToken());
            String eq = st.nextToken();
            int z = Integer.parseInt(st.nextToken());
            
            if(oper.equals("+")) {
                answer[i] = (x+y == z) ? "O" : "X";
            } else if(oper.equals("-")) {
                answer[i] = (x-y == z) ? "O" : "X";
            }
        }
        return answer;
    }
}
