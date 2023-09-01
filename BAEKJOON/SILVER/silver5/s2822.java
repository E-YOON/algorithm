// 점수 계산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class s2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] scores = new int[8][2];
        int[] result = new int[5];
        int sum = 0;

        for(int i=0; i<8; i++) {
            scores[i][0] = Integer.parseInt(br.readLine());
            scores[i][1] = i+1;
        }

        Arrays.sort(scores, (int[] a, int[] b) -> {
            return b[0] - a[0];
        });

        for(int i=0; i<5; i++) {
            sum += scores[i][0];
            result[i] = scores[i][1];
        }

        Arrays.sort(result);

        System.out.println(sum);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }
}
