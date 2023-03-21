import java.util.ArrayList;
import java.util.List;

public class 잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<String>();
        for(int i=0; i<(my_str.length()/n); i++) {
            answer.add(my_str.substring((n*i), (n*(i+1))));
        }
        if(my_str.length()%n != 0) {
            answer.add(my_str.substring((my_str.length()/n)*n));
        }
        return answer.stream().toArray(String[]::new);
    }
}
