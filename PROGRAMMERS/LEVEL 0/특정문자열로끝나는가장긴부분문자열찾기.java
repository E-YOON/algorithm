public class 특정문자열로끝나는가장긴부분문자열찾기 {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i=0; i<myString.length(); i++) {
            if(myString.endsWith(pat)) {
                answer = myString;
                break;
            } else {
                myString = myString.substring(0, myString.length()-1);
            }
        }
        return answer;
    }
}
