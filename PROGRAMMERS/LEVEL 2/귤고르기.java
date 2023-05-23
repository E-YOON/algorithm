import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 1, count = 0;
        HashMap<Integer, Integer> tangerineSize = new HashMap<>();

        for(int i=0; i<tangerine.length; i++) {
            if(tangerineSize.keySet().contains(tangerine[i])) {
                tangerineSize.put(tangerine[i], tangerineSize.get(tangerine[i])+1);
            } else {
                tangerineSize.put(tangerine[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(tangerineSize.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
            
        });

        for(Map.Entry<Integer, Integer> entry : entryList) {
            count += entry.getValue();
            if(count >= k) {
                return answer;
            } else {
                answer++;
            }
        }
        return answer;
    }
}