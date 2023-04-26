import java.util.ArrayList;

public class 할일목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();

        for(int i=0; i<todo_list.length; i++) {
            if(finished[i]) {
                continue;
            } else {
                answer.add(todo_list[i]);
            }
        }
        return answer.toArray(new String[answer.size()]);
    }
}
