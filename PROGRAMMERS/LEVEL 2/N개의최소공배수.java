import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class N개의최소공배수 {
    public int solution(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++) {
            queue.add(arr[i]);
        }

        while(queue.size() >= 2) {
            int a = queue.poll();
            int b = queue.poll();
            queue.add(lcm(a,b));
        }
        return queue.poll();
    }

    public static int lcm(int x, int y) {
        int a = Math.max(x, y);
        int b = Math.min(x, y);
        int gcdNum, num;
        int c = a % b;

        if(c == 0) {
            gcdNum = b;
            return a * b / gcdNum;

        } else {
            while(true) {
                num = b % c;
                if(num != 0) {
                    b = c;
                    c = num;
                }
                if(num == 0) {
                    gcdNum = c;
                    return a * Math.min(x, y) / gcdNum;
                }
            }
        }
    }
}