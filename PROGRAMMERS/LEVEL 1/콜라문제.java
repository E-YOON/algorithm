public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int rest = 0;
        while(n >= a) {
            if(n % a == 0) {
                answer += (n/a) * b;
                n = (n/a) * b;
            } else {
                answer += (n/a) * b;
                rest = n%a;
                n = (n/a) * b;
                n += rest;
            }
        }
        return answer;
    }
}
