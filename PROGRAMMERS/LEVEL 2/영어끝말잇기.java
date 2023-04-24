import java.util.ArrayList;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        ArrayList<String> say = new ArrayList<>();
        int index = 0;
        say.add(words[0]);
        
        for(int i=1; i<words.length; i++) {
            if(!say.contains(words[i])) {
                String preWord = say.get(index);
                if(preWord.charAt(preWord.length()-1) != words[i].charAt(0)) {
                    return fail(n, i);
                }

                index++;
                say.add(words[i]);

            } else {
                return fail(n, i);
            }          
        }

        return answer;
    }

    public static int[] fail(int n, int i) {
        int order = (i / n) + 1;
        int num = (i % n) + 1;
        return new int[] {num, order};
    }
}