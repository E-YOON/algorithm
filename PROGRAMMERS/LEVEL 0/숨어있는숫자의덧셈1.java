public class 숨어있는숫자의덧셈1 {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[^0-9]", "");
        String[] array = str.split("");
        int answer = 0;
        
        for(int i=0; i<array.length; i++) {
            answer += Integer.parseInt(array[i]);
        }
            
        return answer;
    }
}
