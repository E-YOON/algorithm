/**
 * K번째 수
 * 알고리즘 참고 https://st-lab.tistory.com/233
 * 
 * 처음엔 Quick Sort로 시도하였으나 시간 초과로 실패
 * Collections.sort로 하면 성공하는 코드 발견 후
 * 동일한 시간 복잡도를 가진 Merge Sort를 찾음 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s11004 {
    static int N;
    static int K;
    static int[] arr;
    static int[] sorted;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        sorted = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, N-1);

        System.out.println(arr[K-1]);
    }

    public static void mergeSort(int left, int right) {
        if(left == right) return;

        int mid = (left + right) / 2;

        mergeSort(left, mid);
        mergeSort(mid+1, right);

        merge(left, mid, right);
    }

    private static void merge(int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while(l <= mid && r <= right) {
            if(arr[l] <= arr[r]) {
                sorted[idx] = arr[l];
                idx++;
                l++;

            } else {
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }

        if(l > mid) {
            while(r <= right) {
                sorted[idx] = arr[r];
                idx++;
                r++;
            }

        } else {
            while(l <= mid) {
                sorted[idx] = arr[l];
                idx++;
                l++;
            }
        }

        for(int i=left; i<=right; i++) {
            arr[i] = sorted[i];
        }
    }

}
