public class 제곱수판별하기 {
    public int solution(int n) {
        int answer = 0;
        double x = Math.sqrt(n);
        if(x%1 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
