import java.util.HashMap;

public class 최빈값구하기 {
    public int solution(int[] array) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<array.length; i++) {
            if(map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i])+1);
            } else {
                map.put(array[i], 1);
            }
        }
        
        int max = -1;
        for (int key : map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
                answer = key;
            } else if(max == map.get(key)) {
                answer = -1;
            }
            
	        System.out.println(key + " = " + map.get(key)); 
	    }

        return answer;
    }
}
