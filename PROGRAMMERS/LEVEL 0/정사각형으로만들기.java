public class 정사각형으로만들기 {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;

        int max = Math.max(row, column);

        int[][] answer = new int[max][max];
        
        for(int i=0; i<max; i++) {
            for(int j=0; j<max; j++) {
                if(j >= column || i >= row) {
                    answer[i][j] = 0;
                } else {
                    answer[i][j] = arr[i][j];
                }
            }
        }

        return answer;
    }
}
