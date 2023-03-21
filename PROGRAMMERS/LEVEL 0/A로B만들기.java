import java.util.Arrays;

public class A로B만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        char[] bf = before.toCharArray();
        char[] af = after.toCharArray();
        Arrays.sort(bf);
        Arrays.sort(af);
        before = new String(bf);
        after = new String(af);
        return answer = before.equals(after) ? 1 : 0;
    }
}
