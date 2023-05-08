public class 문자열여러번뒤집기 {
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();

        for(int i=0; i<queries.length; i++) {
            for (int l = queries[i][0], h = queries[i][1]; l < h; l++, h--) {
                char temp = answer[l];
                answer[l] = answer[h];
                answer[h] = temp;
            }
        }

        return String.valueOf(answer);
    }
}
