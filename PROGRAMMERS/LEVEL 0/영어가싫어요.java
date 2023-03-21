public class 영어가싫어요 {
    public long solution(String numbers) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<=9; i++) {
            if(numbers.contains(num[i])) {
                numbers = numbers.replaceAll(num[i], String.valueOf(i));
            }
        }
        return Long.parseLong(numbers);
    }
}
