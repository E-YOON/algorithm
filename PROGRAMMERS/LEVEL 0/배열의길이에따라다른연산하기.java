public class 배열의길이에따라다른연산하기 {
    public int[] solution(int[] arr, int n) {
        if(arr.length%2 != 0) {
            for(int i=0; i<arr.length; i++) {
                if(i%2 == 0) {
                    arr[i] += n;
                }
            }
        } else if(arr.length%2 == 0) {
            for(int i=0; i<arr.length; i++) {
                if(i%2 != 0) {
                    arr[i] += n;
                }
            }
        }
        return arr;
    }
}
