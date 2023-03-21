public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        int idx = 1;
        for(int i=0; i<str.length(); i++) {
            answer[i] = str.charAt(str.length()-idx)-48;
            idx++;
        }
        return answer;
    }
}
