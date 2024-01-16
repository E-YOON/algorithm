/*
 * 버블 소트
 * 
 * swap이 한 번도 일어나지 않은 루프가 언제인지 알아내는 문제
 * swap이 한 번도 일어나지 않았다는 것은 모든 데이터가 정렬됐다는 것
 * -> 데이터의 정렬 전 index와 정렬 후 index를 비교해서 가장 많이 이동한 값 찾기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class g1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        myData[] arr = new myData[N];
        for(int i=0; i<N; i++) {
            arr[i] = new myData(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(arr);

        int max = 0;
        for(int i=0; i<N; i++) {
            // 정렬 전 index - 정렬 후 index 계산의 최댓값 구하기
            if(max < arr[i].index-i) {
                max = arr[i].index-i;
            }
        }

        System.out.println(max + 1);
    }

}

class myData implements Comparable<myData> {
    int value;
    int index;

    public myData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(myData o) {
        // value 기준 오름차순 정렬
        return this.value - o.value;
    }

    
}