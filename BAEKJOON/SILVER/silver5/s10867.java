// 중복 빼고 정렬하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] result = Arrays.stream(arr).distinct().sorted().toArray(Integer[]::new);

        for(Integer i : result) {
            System.out.print(i + " ");
        }
    }
}
