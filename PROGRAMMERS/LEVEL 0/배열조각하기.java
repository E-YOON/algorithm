import java.util.ArrayList;
import java.util.List;

public class 배열조각하기 {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            answer.add(arr[i]);
        }

        for(int i=0; i<query.length; i++) {
            int size = answer.size()-1;
            if(i%2 == 0) {
                for(int j=query[i]; j<size; j++) {
                    answer.remove(query[i]+1);
                }
            } else {
                for(int j=0; j<query[i]; j++) {
                    answer.remove(0);
                }
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
