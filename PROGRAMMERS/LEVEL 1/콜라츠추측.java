public class 콜라츠추측 {
    public int solution(long num) {
        int answer = 0;
        if(num == 1) {
            answer = 0;
        } else {
            for(int i=1; i<=500; i++) {
                num = num%2==0 ? num/2 : num*3+1;
                if(num == 1) {
                    answer = i;
                    break;
                }
            }
            if(answer == 0) answer = -1;
        }
        return answer;
    }
}
