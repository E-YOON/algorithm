public class 팩토리얼 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<n+2; i++) {
            if(factorial(i) > n) {
                answer=i-1;
                break;
            } 
        }
        return answer;
    }
    
    public static int factorial(int num) {
        if (num>1) {
            return num * factorial(num-1);
        } else {
            return 1;
        }
    }
}
