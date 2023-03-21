public class a369게임 {
    public int solution(int order) {
        int answer = 0;
        while(order > 0) {
            int number = order%10;
            order = order/10;
            if(number == 3 || number == 6 || number == 9) {
                answer++;
            }
        }
        return answer;
    }
}
