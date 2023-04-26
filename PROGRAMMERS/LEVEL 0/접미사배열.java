import java.util.ArrayList;
import java.util.Arrays;

public class 접미사배열 {
    public String[] solution(String my_string) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            arr.add(my_string.substring(0+i, my_string.length()));
        }
        String[] answer = arr.toArray(new String[arr.size()]);
        Arrays.sort(answer);
        return answer;
    }
}
