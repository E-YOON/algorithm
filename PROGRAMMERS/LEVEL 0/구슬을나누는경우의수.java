public class 구슬을나누는경우의수 {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }
    
    public static int combination(int ball, int share) {
        if(ball == share || share == 0) {
            return 1;
        } else {
            return combination(ball-1, share) + combination(ball-1, share-1);
        }
    }
}
