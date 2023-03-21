public class 유한소수판별하기 {
    public int solution(int a, int b) {
        int answer = 0;
        for(int i=1; i<Math.max(a,b)+1; i++) {
            if(a%i == 0 && b%i == 0) {
                a /= i;
                b /= i;
            }
        }
        
        answer = check(b);
            
        return answer;
    }
    
    public int check(int num) {
        while(num > 1) {
            if(num%2 == 0) {
                num /= 2;
            } else if(num%5 == 0) {
                num /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
}
