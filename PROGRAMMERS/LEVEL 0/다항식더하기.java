public class 다항식더하기 {
    public String solution(String polynomial) {
        int sumX = 0;
        int sumN = 0;

        for(String s : polynomial.split(" ")) {
            if(s.contains("x")) {
                sumX += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else if (!s.equals("+")) {
                sumN += Integer.parseInt(s);
            }
        }
        String sumXStr = sumX > 0 ? sumX == 1 ? "x" : sumX + "x" : "";
        String sumNStr = sumN > 0 ? String.valueOf(sumN) : "";

        String answer="";

        if(sumX > 0) {
            if(sumN > 0) {
                answer += sumXStr + " + " + sumNStr;
            } else {
                answer += sumXStr;
            }
        } else if(sumN > 0) {
            answer += sumNStr;
        }
        
        return answer;
    }
    
}