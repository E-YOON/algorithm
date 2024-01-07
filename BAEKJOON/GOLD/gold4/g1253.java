// 좋다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class g1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[N];

        for(int i=0; i<N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        
        int answer = 0;

        for(int i=0; i<N; i++) {
            // 찾으려는 수
            long num = arr[i];

            int start = 0;
            int end = N-1;

            // 투 포인터
            while(start < end) {
                if(arr[start] + arr[end] == num) {
                    // 수의 위치가 다르면 값이 같아도 다른 수이기 때문에 인덱스로 체크
                    if(start != i && end != i) {
                        answer++;
                        break;

                    // 찾으려는 수와 다른 수여야 함
                    } else if(start == i) {
                        start++;
                    } else if(end == i) {
                        end--;
                    }

                } else if(arr[start] + arr[end] < num) {
                    start++;

                } else {
                    end--;
                }
            }
        }

        System.out.println(answer);
    }
    
}