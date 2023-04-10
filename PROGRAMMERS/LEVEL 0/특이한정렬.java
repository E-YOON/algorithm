import java.util.Arrays;
import java.util.Comparator;

public class 특이한정렬 {
    public int[] solution(int[] numlist, int n) {
        int[][] arr = new int[numlist.length][2];

        for(int i=0; i<numlist.length; i++) {
            arr[i][0] = Math.abs(numlist[i] - n);
            arr[i][1] = numlist[i];
        }
        
        Arrays.sort(arr, new Comparator<int[]>() { 
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o2[1]-o1[1];
            }
        });

        for(int i=0; i<numlist.length; i++) {
            numlist[i] = arr[i][1];
        }
        
        return numlist;
    }
}
