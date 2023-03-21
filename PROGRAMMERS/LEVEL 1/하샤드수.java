public class 하샤드수 {
    public boolean solution(int x) {
        String number = String.valueOf(x);
        int sum = 0;
        for(int i=0; i<number.length(); i++) {
            sum += number.charAt(i)-'0';
        }

        return x%sum == 0 ? true : false;
    }
}
