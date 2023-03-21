public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            int count = 0;
            int num = 1;
            while(num<=i) {
                if(i%num==0) {
                    count++;
                }
                num++;
            }
            if(count%2==0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}
