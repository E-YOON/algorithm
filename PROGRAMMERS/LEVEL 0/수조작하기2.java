public class 수조작하기2 {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=0; i<numLog.length-1; i++) {
            int num = numLog[i] - numLog[i+1];
            if(num == -1) {
                answer += "w";
            } else if(num == 1) {
                answer += "s";
            } else if(num == -10) {
                answer += "d";
            } else if(num == 10) {
                answer += "a";
            }
        }
        return answer;
    }
}
