public class 마지막두원소 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        for(int i=0; i<answer.length-1; i++) {
            answer[i] = num_list[i];

            if(i == answer.length-2) {
                if(answer[i] <= answer[i-1]) {
                    answer[i+1] = answer[i] * 2;
                } else {
                    answer[i+1] = answer[i] - answer[i-1];
                }
            }
        }
        return answer;
    }
}
