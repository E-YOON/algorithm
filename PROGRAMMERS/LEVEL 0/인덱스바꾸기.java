public class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);
        sb.setCharAt(num1, b);
        sb.setCharAt(num2, a);
        String answer = sb.toString();
        return answer;
    }
}
