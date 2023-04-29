public class 두수의연산값비교하기 {
    public int solution(int a, int b) {
        String ab = a + "" + b;
        int num = 2 * a * b;
        return Integer.parseInt(ab) > num ? Integer.parseInt(ab) : num;
    }
}
