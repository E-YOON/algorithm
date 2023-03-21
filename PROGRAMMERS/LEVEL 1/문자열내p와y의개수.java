public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;
        
        String[] str = s.split("");
        int y=0, p=0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("y") || str[i].equals("Y")) {
                y++;
            } else if(str[i].equals("p") || str[i].equals("P")) {
                p++;
            }
        }
        
        if(y==p) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
