public class 수열과구간쿼리2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
            int min = 1000001;
            for(int j=queries[i][0]; j<=queries[i][1]; j++) {
                if(queries[i][2] < arr[j] && arr[j] < min) {
                    min = arr[j];
                }

                if(min == 1000001) {
                    answer[i] = -1;
                } else {
                    answer[i] = min;
                }
            }
        }
        return answer;
    }
}
