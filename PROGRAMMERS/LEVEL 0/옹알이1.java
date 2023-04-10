import java.util.ArrayList;
import java.util.List;

public class 옹알이1 {
    public int solution(String[] babbling) {
        int answer = 0;
        
        List<String[]> list = new ArrayList<>();

        for(int i=0; i<babbling.length; i++) {
            String[] str = babbling[i].split("aya|ye|woo|ma");
            list.add(str);
        }

        for(int i=0; i<list.size(); i++) {
            if(list.get(i).length == 0)
                answer++;
        }
        return answer;
    }
}
