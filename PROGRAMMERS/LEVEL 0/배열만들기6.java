import java.util.ArrayList;

public class 배열만들기6 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int n = 0;

        while(n < arr.length) {
            if(stk.isEmpty()) {
                stk.add(arr[n]);
                n++;
            
            } else {
                if(stk.get(stk.size()-1) == arr[n]) {
                    stk.remove(stk.size()-1);
                    n++;
                } else {
                    stk.add(arr[n]);
                    n++;
                }
            }
        }

        if(stk.isEmpty()) {
            stk.add(-1);
        }

        return stk.stream().mapToInt(i->i).toArray();
    }
}
