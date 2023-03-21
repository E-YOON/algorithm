public class 피자나눠먹기2 {
    public int solution(int n) {
        int answer = 1;
        while(true) {
            int piece = answer * 6;
            if(piece % n == 0) {
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }
}
