import java.util.ArrayList;

public class 배열의원소만큼추가하기 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i]; j++) {
                answer.add(arr[i]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
