public class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int binToDec1 = Integer.parseInt(bin1, 2);
        int binToDec2 = Integer.parseInt(bin2, 2);
        answer = Integer.toBinaryString(binToDec1 + binToDec2);
        return answer;
    }
}
