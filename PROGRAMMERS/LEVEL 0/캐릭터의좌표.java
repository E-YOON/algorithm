public class 캐릭터의좌표 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = board[0] == 0 ? 0 : board[0]/2;
        int y = board[1] == 0 ? 0 : board[1]/2;

        for(int i=0; i<keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                if(answer[0] <= x*-1) {
                    answer[0] = x*-1;
                } else {
                    answer[0] -= 1;
                }
            } else if(keyinput[i].equals("right")) {
                if(answer[0] >= x) {
                    answer[0] = x;
                } else {
                    answer[0] += 1;
                }
            } else if(keyinput[i].equals("up")) {
                if(answer[1] >= y) {
                    answer[1] = y;
                } else {
                    answer[1] += 1;
                }
            } else if(keyinput[i].equals("down")) {
                if(answer[1] <= y*-1) {
                    answer[1] = y*-1;
                } else {
                    answer[1] -= 1;
                }
            }
        }

        return answer;
    }
}