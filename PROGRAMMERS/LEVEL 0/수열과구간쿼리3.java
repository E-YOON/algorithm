public class 수열과구간쿼리3 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][0];
            int a = arr[x];
            int b = arr[y];
            arr[x] = b;
            arr[y] = a;
        }
        return arr;
    }
}
