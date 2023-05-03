import java.util.ArrayList;

public class a2의영역 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        boolean has = false;
        int start = 11;
        int end = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                has = true;
                if(start == 11) {
                    start = i;
                } else {
                    end = i;
                }
            }
        }

        if(has) {
            if(end == 0) {
                answer.add(arr[start]);
            } else {
                for(int i=start; i<=end; i++) {
                    answer.add(arr[i]);
                }
            }
        } else {
            answer.add(-1);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
