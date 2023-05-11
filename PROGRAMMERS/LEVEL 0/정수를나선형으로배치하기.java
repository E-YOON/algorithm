public class 정수를나선형으로배치하기 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int i = 0;
        int j = 0;
        answer[i][j] = 1;
        int a = 2;

        while(a <= n * n) {
            while(j+1<n && answer[i][j+1] == 0) {
                j++;
                answer[i][j] = a;
                a++;
            }

            while(i+1<n && answer[i+1][j] == 0) {
                i++;
                answer[i][j] = a;
                a++;
            }

            while(j-1 >= 0 && answer[i][j-1] == 0) {
                j--;
                answer[i][j] = a;
                a++;
            }

            while(i-1 >= 0 && answer[i-1][j] == 0) {
                i--;
                answer[i][j] = a;
                a++;
            }
        }
        return answer;
    }
}
