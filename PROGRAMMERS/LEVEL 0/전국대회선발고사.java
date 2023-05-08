import java.util.Arrays;
import java.util.HashMap;

public class 전국대회선발고사 {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<attendance.length; i++) {
            if(attendance[i]) {
                map.put(rank[i], i);
            }
        }

        Object[] mapKey = map.keySet().toArray();
        Arrays.sort(mapKey);

        return (10000 * map.get(mapKey[0])) + (100 * map.get(mapKey[1])) + map.get(mapKey[2]);
    }
}
