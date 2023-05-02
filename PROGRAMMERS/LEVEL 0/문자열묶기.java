import java.util.Arrays;

public class 문자열묶기 {
    public int solution(String[] strArr) {
        int[] arr = new int[31];
        for(int i=0; i<strArr.length; i++) {
            arr[strArr[i].length()] += 1;
        }
        Arrays.sort(arr);
        return arr[30];
    }
}
