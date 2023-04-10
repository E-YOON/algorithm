public class 연속된수의합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int cnt = 0;
        int mid = total / num;

        if(num%2 == 0) {
            cnt = (num/2)-1;
        } else {
            cnt = num/2;
        }

        answer[0] = mid-cnt;

        for(int i=1; i<answer.length; i++) {
            answer[i] = answer[i-1]+1;
        }

        return answer;
    }
}
