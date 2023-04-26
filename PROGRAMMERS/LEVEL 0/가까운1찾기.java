public class 가까운1찾기 {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for(int i=0; i<arr.length; i++) {
            if(i >= idx) {
                if(arr[i] == 1) {
                    return i;
                }
            }
        }
        return answer;
    }
}
