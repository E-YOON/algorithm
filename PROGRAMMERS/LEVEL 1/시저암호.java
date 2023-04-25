public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        char[] sArr = s.toCharArray();
        String small = "abcdefghijklmnopqrstuvwxyz";
        String big = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

        for(char c : sArr) {
            int asc = (int)c;

            if(small.contains(String.valueOf(c))) {
                answer += (char)'a' + (asc - 'a' + n) % 26;

            } else if(big.contains(String.valueOf(c))) {
                answer += (char)'A' + (asc - 'A' + n) % 26;

            } else {
                answer += " ";
            }
        }
        return answer;
    }
}
