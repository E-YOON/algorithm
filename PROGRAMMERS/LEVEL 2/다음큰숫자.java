public class 다음큰숫자 {
    public int solution(int n) {
        int answer = n+1;
        int nCount = Integer.bitCount(n);

        while(true) {
            if(Integer.bitCount(answer) == nCount) {
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }
}
