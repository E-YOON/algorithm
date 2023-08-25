// 숫자 카드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(arr, N, num) + " ");
        }

        System.out.println(sb);
    }

    public static int binarySearch(int arr[], int N, int num) {
        int first = 0;
        int last = N-1;
        int mid = 0;

        while(first <= last) {
            mid = (first + last) / 2;
            if(arr[mid] == num) {
                return 1;
            }

            if(arr[mid] < num) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return 0;
    }
}
