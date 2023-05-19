public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long num = Long.parseLong(p);
        
        for(int i=0; i<=t.length() - pLength; i++) {
            String str = t.substring(i, i+pLength);
            if(num >= Long.parseLong(str)) {
                answer++;
            }
        }
        return answer;
    }
}
