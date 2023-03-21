public class 배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int idx = 0;
        while(true) {
            if(num1 > num2) break;
            
            answer[idx] = numbers[num1];
            
            idx++;
            num1++;
        }
        return answer;
    }
}
