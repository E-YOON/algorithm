public class 점프와순간이동 {
    public int solution(int n) {
        int ans = 0;

        while(n > 0) {
            if(n % 2 != 0) {
                ans++;
            }

            n /= 2;
        }

        return ans;
    }
}
