import java.util.Arrays;

public class 중앙값구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int idx = array.length%2 == 0 ? array.length/2-1 : array.length/2;
        return array[idx];
    }
}
