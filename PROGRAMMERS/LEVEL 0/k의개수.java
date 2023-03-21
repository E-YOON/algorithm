public class k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(i=i; i<=j; i++) {
            str += i;
        }
        String[] num = str.split("");
        for(int h=0; h<num.length; h++) {
            if(num[h].equals(String.valueOf(k))) {
                answer++;
            }
        }
        return answer;
    }
}
