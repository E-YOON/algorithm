public class 정수제곱근판별 {
    public long solution(long n) {
        double doubleSqrt = Math.sqrt(n);
        int intSqrt = (int)doubleSqrt;
        return intSqrt == doubleSqrt ? (long)Math.pow(intSqrt+1,2) : -1;
    }
}
