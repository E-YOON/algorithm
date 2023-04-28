public class a5명씩 {
    public String[] solution(String[] names) {
        String[] answer;
        if(names.length % 5 == 0) {
            answer = new String[names.length/5];
        } else {
            answer = new String[names.length/5+1];
        }
        
        int idx = 0;
        for(int i=0; i<names.length; i++) {
            if(i % 5 == 0) {
                answer[idx] = names[i];
                idx++;
            }
        }
        return answer;
    }
}
