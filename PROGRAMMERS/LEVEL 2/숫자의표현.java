public class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        int odd = 1;

        while(true) {
            if(n % odd == 0) {
                answer++;
            }
            odd += 2;

            if(odd > n) {
                break;
            }
        }
        return answer;
    }
}
