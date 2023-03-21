public class 진료순서정하기 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] order = emergency.clone();
        order = sortMax(order);
        for(int i=0; i<answer.length; i++) {
            int idx = 0;
            while(true) {
                if(emergency[i]==order[idx]) {
                    answer[i] = idx+1;
                    break;
                }
                idx++;
            }
        }
        return answer;
    }
    
    public static int[] sortMax(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
