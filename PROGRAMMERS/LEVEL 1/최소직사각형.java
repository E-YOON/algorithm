public class 최소직사각형 {
    public int solution(int[][] sizes) {
        sizes = rotation(sizes);
        int wMax = 0, hMax = 0;
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] > wMax) {
                wMax = sizes[i][0];
            }
            if(sizes[i][1] > hMax) {
                hMax = sizes[i][1];
            }
        }
        return wMax * hMax;
    }

    public int[][] rotation(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i][0] < arr[i][1]) {
                int num = arr[i][0];
                arr[i][0] = arr[i][1];
                arr[i][1] = num;
            }
        }
        return arr;
    } 
}