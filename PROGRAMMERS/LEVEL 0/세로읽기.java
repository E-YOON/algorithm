public class 세로읽기 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int cnt = my_string.length()%m == 0 ? my_string.length()/m : my_string.length()/m+1;
        String str;
        for(int i=0; i<cnt; i++) {
            if(my_string.length() >= m) {
                str = my_string.substring(0, m);
                my_string = my_string.substring(m+1);
            } else {
                str = my_string;
                my_string = "";
            }
            answer += str.charAt(c-1);
        }
        return answer;
    }
}
