// 수 정렬하기 2

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class s2751 {
    public static int[] arr, tmp;
    public static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        tmp = new int[N+1];

        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        mergeSort(1, N);

        for(int i=1; i<=N; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static void mergeSort(int s, int e) {
        if(e-s < 1) return;

        int m = s + (e-s) / 2;

        mergeSort(s, m);
        mergeSort(m+1, e);

        for(int i=s; i<=e; i++) {
            tmp[i] = arr[i];
        }

        int k = s;
        int index1 = s;
        int index2 = m+1;

        while(index1 <= m && index2 <= e) {
            if(tmp[index1] > tmp[index2]) {
                arr[k] = tmp[index2];
                k++;
                index2++;
            } else {
                arr[k] = tmp[index1];
                k++;
                index1++;
            }
        }

        while(index1 <= m) {
            arr[k] = tmp[index1];
            k++;
            index1++;
        }
        while (index2 <= e) {
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}
