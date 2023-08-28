// 방 번호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class s1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int[] arr = new int[10];

        for(int i=0; i<str.length; i++) {
            int num = Integer.parseInt(str[i]);
            if(num == 9) {
                arr[6]++;
            } else {
                arr[num]++;
            }
        }

        arr[6] = arr[6]/2 + arr[6]%2;

        Arrays.sort(arr);
        System.out.println(arr[9]);
    }
}
