public class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = 0;
        String[] str = String.valueOf(num).split("");
        String x = Integer.toString(k);
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(x)) {
                answer = i+1;
                break;
            }
        }
        if(answer == 0) answer = -1;
        return answer;
    }
}
