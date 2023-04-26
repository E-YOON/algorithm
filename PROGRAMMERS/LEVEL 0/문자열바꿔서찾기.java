public class 문자열바꿔서찾기 {
    public int solution(String myString, String pat) {
        String change = "";
        String[] str = myString.split("");
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("A")) {
                change += "B";
            } else if(str[i].equals("B")) {
                change += "A";
            }
        }
        return change.contains(pat) ? 1 : 0;
    }
}
