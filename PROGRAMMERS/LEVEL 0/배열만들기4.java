import java.util.ArrayList;

public class 배열만들기4 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int a = 0;
        while(a < arr.length) {
            if(stk.isEmpty()) {
                stk.add(arr[a]);
                a++;
            } else if(stk.get(stk.size()-1) < arr[a]) {
                stk.add(arr[a]);
                a++;
            } else if(stk.get(stk.size()-1) >= arr[a]) {
                stk.remove(stk.size()-1);
            }
        }
        return stk.stream().mapToInt(i->i).toArray();
    }
}
