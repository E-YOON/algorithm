import java.util.ArrayList;

public class 무작위로K개의수뽑기 {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(!answer.contains(arr[i])) {
                answer.add(arr[i]);
            }

            if(answer.size() == k) {
                return answer.stream().mapToInt(Integer::intValue).toArray();
            }
        }

        if(answer.size() < k) {
            for(int i=0; i<k; i++) {
                answer.add(-1);
            }
        }

        while(answer.size() < k) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
