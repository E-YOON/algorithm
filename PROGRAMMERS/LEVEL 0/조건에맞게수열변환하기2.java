import java.util.Arrays;

public class 조건에맞게수열변환하기2 {
    public int solution(int[] arr) {
        int[] prevArr = arr.clone();
        int[] nextArr = arr.clone();
        int x = 0;

        while(true) {
            nextArr = cal(arr);
            x++;
            
            if(Arrays.equals(prevArr,nextArr)) {
                break;
            }

            prevArr = nextArr.clone();
        }
        return x-1;
    }

    public int[] cal(int[] arr) {
        for(int j=0; j<arr.length; j++) {
            if(50 <= arr[j] && arr[j]%2 == 0) {
                arr[j] /= 2;
            } else if(50 > arr[j] && arr[j]%2 != 0) {
                arr[j] *= 2;
                arr[j]++;
            }
        }
        return arr;
    }
}
