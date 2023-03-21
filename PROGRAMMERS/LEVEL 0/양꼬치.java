public class 양꼬치 {
    public int solution(int n, int k) {
        int answer = 0;
        answer = n*12000 + k*2000;
        if(n >= 10) {
            int cnt = n/10;
            answer -= cnt*2000;
        }
        return answer;
    }
}
