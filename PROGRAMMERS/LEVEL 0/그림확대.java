public class 그림확대 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;

        for(int i=0; i<picture.length; i++) {
            String str = "";

            for(int j=0; j<picture[i].length(); j++) {
                for(int h=0; h<k; h++) {
                    str += picture[i].charAt(j);
                }
            }

            for(int h=0; h<k; h++) {
                answer[index] = str;
                index++;
            }
        }

        return answer;
    }
}
