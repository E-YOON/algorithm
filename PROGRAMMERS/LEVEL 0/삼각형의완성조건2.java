public class 삼각형의완성조건2 {
    public int solution(int[] sides) {
        return Math.min(sides[0], sides[1])*2-1;
    }
}
