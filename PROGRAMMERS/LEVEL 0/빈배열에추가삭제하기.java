import java.util.ArrayList;

public class 빈배열에추가삭제하기 {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(flag[i]) {
                for(int j=0; j<arr[i]*2; j++) {
                    answer.add(arr[i]);
                }
            } else {
                for(int j=0; j<arr[i]; j++) {
                    answer.remove(answer.size());
                }
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
