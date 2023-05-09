public class 문자열이몇번등장하는지세기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.indexOf(pat, i) >= 0) {
                answer++;
                i = myString.indexOf(pat, i);
            }
        }
        return answer;
    }
}
