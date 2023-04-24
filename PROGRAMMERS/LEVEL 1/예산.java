import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

        for(int i=0; i<d.length; i++) {
            sum += d[i];
            answer++;

            if(sum == budget) {
                break;
            } else if(sum > budget) {
                sum -= d[i];
                answer--;
                break;
            }
        }
        return answer;
    }
}
