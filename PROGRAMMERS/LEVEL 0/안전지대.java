public class 안전지대 {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] dangerBoard = new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j] == 1) {
                    findDanger(i, j, dangerBoard);
                }
            }
        }
        
        for(int[] arr : dangerBoard) {
            for(int n : arr) {
                if(n == 0) answer++;
            }
        }
        
        return answer;
    }
    
    public void findDanger(int x, int y, int[][] dangerBoard) {
        int[] dangerX = {0, -1, -1, -1, 0, 0, 1, 1, 1};
        int[] dangerY = {0, -1, 0, 1, -1, 1, -1, 0, 1};
        int X;
        int Y;
        for(int i=0; i<9; i++) {
            X = x + dangerX[i];
            Y = y + dangerY[i];
            if(X >= 0 && Y >= 0) {
                if(X < dangerBoard.length && Y < dangerBoard.length) {
                    dangerBoard[X][Y] = 1;
                }
            }
        }
        
    }
    
}