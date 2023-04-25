public class 원소들의곱과합 {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;
        for(int i : num_list) {
            sum += i;
            multiply *= i;
        }
        int answer = multiply < sum*sum ? 1 : 0;
        return answer;
    }
}
