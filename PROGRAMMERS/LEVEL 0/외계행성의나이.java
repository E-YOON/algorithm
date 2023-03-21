public class 외계행성의나이 {
    public String solution(int age) {
        String answer = "";
        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String x = Integer.toString(age);
        for(int i=0; i<x.length(); i++) {
            int idx = x.charAt(i)-'0';
            answer += str[idx];
        }
        return answer;
    }
}
