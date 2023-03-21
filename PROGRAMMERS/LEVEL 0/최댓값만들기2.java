public class 최댓값만들기2 {
    public int solution(int[] numbers) {
        int answer = -100000000;
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<i; j++) {
                if(numbers[i] * numbers[j] >= answer) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
}
