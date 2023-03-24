public class 평행 {
    public int solution(int[][] dots) {
        int answer = 0;
        
        double slopeA = slope(dots[0], dots[1]);
        double slopeB = slope(dots[2], dots[3]);
        double slopeC = slope(dots[0], dots[2]);
        double slopeD = slope(dots[1], dots[3]);
        double slopeE = slope(dots[0], dots[3]);
        double slopeF = slope(dots[1], dots[2]);

        if(slopeA == slopeB || slopeC == slopeD || slopeE == slopeF) return 1;
        
        return answer;
    }
    
    public double slope(int[] arr1, int[] arr2) {
        return (double)(arr2[1] - arr1[1]) / (double)(arr2[0] - arr1[0]);
    }
    
}