import java.util.ArrayList;

public class 배열만들기2 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=l; i<=r; i++) {
            int num = i;
            boolean is = false;

            while(num > 0) {
                if(num % 10 == 0 || num % 10 == 5) {
                    num /= 10;
                    is = true;
                } else {
                    is = false;
                    break;
                }
            }
            
            if(is) {
                answer.add(i);
            }
        }

        if(answer.isEmpty()) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
