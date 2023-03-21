import java.util.ArrayList;
import java.util.List;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int min = arr[0];
        if(arr.length == 1) {
            answer.add(-1);
        } else {
            for(int i : arr) min = Math.min(i, min);
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != min) {
                    answer.add(arr[i]);
                }
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
