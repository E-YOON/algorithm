import java.util.ArrayList;

public class 배열만들기3 {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<intervals.length; i++) {
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++) {
                answer.add(arr[j]);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
