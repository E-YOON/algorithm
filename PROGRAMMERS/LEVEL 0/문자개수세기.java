public class 문자개수세기 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++) {
            int n = my_string.charAt(i);
            if(64 < n && n < 97 ) {
                answer[n-65]++;
            } else {
                answer[n-71]++;
            }
        }
        return answer;
    }
}
