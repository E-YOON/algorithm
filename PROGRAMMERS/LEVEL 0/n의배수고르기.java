import java.util.ArrayList;

public class n의배수고르기 {
    public ArrayList solution(int n, int[] numlist) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int num : numlist) {
            if(num % n == 0) {
                answer.add(num);
            }
        }
        
        return answer;
    }
}
