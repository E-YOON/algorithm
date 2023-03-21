import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;
        String x = "";
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        for(int i=0; i<str.length; i++) {
            x += str[i];
        }
        return answer = Long.parseLong(x);
    }
}
