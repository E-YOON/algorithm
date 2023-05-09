import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {
    public int[] solution(int[] arr) {
        int min = 1;
        
        while(min < arr.length) {
            min *= 2;
        }

        return Arrays.copyOf(arr, min);
    }
}
