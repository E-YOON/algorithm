public class 가까운수 {
    public int solution(int[] array, int n) {
        int min = Math.abs(array[0]-n);
        int answer = array[0];
        for(int i=1; i<array.length; i++) {
            if(min > Math.abs(array[i]-n)) {
                answer = array[i];
                min = Math.abs(array[i]-n);
            } else if(min == Math.abs(array[i]-n)) {
                answer = Math.min(answer, array[i]);
            }
        }
        return answer;
    }
}
