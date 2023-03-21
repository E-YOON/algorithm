public class 치킨쿠폰 {
    public int solution(int chicken) {
        int answer = 0;
        int service = 0;
        int coupon = chicken;
        
        while(true) {
            service = coupon/10;
            answer += service;
            coupon = service + coupon%10;
            
            if(coupon < 10) break;
        }
        
        return answer;
    }
}
