import java.util.ArrayList;

public class 콜라츠수열만들기 {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        while(n != 1) {
            answer.add(n);
            if(n%2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
