public class A강조하기 {
    public String solution(String myString) {
        String answer = "";
        String[] str = myString.split("");
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("a") || str[i].equals("A")) {
                answer += "A";
            } else {
                answer += str[i].toLowerCase();
            }
        }
        return answer;
    }
}
