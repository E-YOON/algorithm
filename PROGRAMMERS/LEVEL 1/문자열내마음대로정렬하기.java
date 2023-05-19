import java.util.Arrays;
import java.util.Comparator;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {      
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.charAt(n) > b.charAt(n)) {
                    return 1;
                } else if(a.charAt(n) < b.charAt(n)) {
                    return -1;
                } else {
                    return a.compareTo(b);
                }
            }
        });
        return strings;
    }
}
