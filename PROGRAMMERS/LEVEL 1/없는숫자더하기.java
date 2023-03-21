public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        int number = 1+2+3+4+5+6+7+8+9;
        for(int i=0; i<numbers.length; i++) {
            for(int j=1; j<10; j++) {
                if(numbers[i] == j) {
                    answer += j;
                    break;
                }
            }
        }
        return number-answer;
    }
}
