public class qrCode {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        while(code.length() >= q) {
            String str = code.substring(0, q);
            code = code.substring(q);
            answer += str.charAt(r);
        }
        
        if(code.length() > r) {
            answer += code.charAt(r);
        }
        
        return answer;
    }
}
