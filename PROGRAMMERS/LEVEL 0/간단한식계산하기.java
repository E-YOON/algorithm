public class 간단한식계산하기 {
    public int solution(String binomial) {
        int answer = 0;
        String[] ex = binomial.split(" ");
        if(ex[1].equals("+")) {
            return Integer.parseInt(ex[0]) + Integer.parseInt(ex[2]);
        } else if(ex[1].equals("-")) {
            return Integer.parseInt(ex[0]) - Integer.parseInt(ex[2]);
        } else if(ex[1].equals("*")) {
            return Integer.parseInt(ex[0]) * Integer.parseInt(ex[2]);
        }
        return answer;
    }
}
