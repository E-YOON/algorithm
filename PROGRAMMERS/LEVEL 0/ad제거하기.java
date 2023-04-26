public class ad제거하기 {
    public String[] solution(String[] strArr) {
        int count = 0;
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].contains("ad")) {
                count++;
            }
        }
        String[] answer = new String[strArr.length-count];
        int idx = 0;
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].contains("ad")) {
                continue;
            } else {
                answer[idx] = strArr[i];
                idx++;
            }
        }
        return answer;
    }
}
