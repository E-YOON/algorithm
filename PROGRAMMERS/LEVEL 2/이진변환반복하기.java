public class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(true) {
            answer[0]++;
            int zeros = count(s);
            answer[1] += zeros;
            s = Integer.toBinaryString(s.length()-zeros);

            if(s.equals("1")) {
                break;
            }
        }
        return answer;
    }

    public static int count(String s) {
        return s.length() - s.replaceAll("0", "").length();
    }
}