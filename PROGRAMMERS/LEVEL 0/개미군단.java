public class 개미군단 {
    public int solution(int hp) {
        int answer = 0;
        while(hp>=5) {
            hp = hp-5;
            answer++;
        }
        while(hp>=3) {
            hp = hp-3;
            answer++;
        }
        while(hp>=1) {
            hp = hp-1;
            answer++;
        }
        return answer;
    }
}
