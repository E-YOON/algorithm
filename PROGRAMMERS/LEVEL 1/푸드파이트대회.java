public class 푸드파이트대회 {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++) {
            for(int j=0; j<food[i]/2; j++) {
                answer += i;
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        return answer + "0" + reverse;
    }
}
