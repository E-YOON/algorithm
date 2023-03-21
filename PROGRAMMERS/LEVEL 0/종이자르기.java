public class 종이자르기 {
    public int solution(int M, int N) {
        int answer = 0;
        if(M==1 && N==1) {
            answer = 0;
        } else {
            answer = M*N-1;
        }
        return answer;
    }
}
