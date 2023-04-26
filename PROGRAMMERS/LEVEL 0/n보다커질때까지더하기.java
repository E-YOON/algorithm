public class n보다커질때까지더하기 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i=0; i<numbers.length; i++) {
            answer += numbers[i];
            if(answer > n) {
                return answer;
            }
        }
        return answer;
    }
}
