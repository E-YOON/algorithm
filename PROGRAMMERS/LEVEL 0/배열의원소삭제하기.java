import java.util.ArrayList;

public class 배열의원소삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();

        int idx = 0;

        for(int i=0; i<arr.length; i++) {
            boolean isSame = false;
            for(int j=0; j<delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    isSame = true;
                }
            }

            if(isSame) {
                continue;
            }

            answer.add(idx, arr[i]);
            idx++;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
