// 오큰수

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class g17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int answer[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장할 stack
        stack.push(0);  // arr[]의 인덱스 push (초기값 설정)

        for(int i=1; i<n; i++) {
            // 빈 스택이 아니고, 스택의 top보다 현재 arr[i]의 값이 더 클 때
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                // 정답 배열에 현재 arr[i]의 값 저장
                answer[stack.pop()] = arr[i];
            }

            // 다음 값과 비교하기 위해 현재 인덱스 push
            stack.push(i);
        }

        // 반복문이 끝나고 stack이 비어있지 않으면
        while(!stack.empty()) {
            // stack에 쌓인 index에 -1 저장
            answer[stack.pop()] = -1;
        }

        for(int i=0; i<n; i++) {
            bw.write(answer[i] + " ");
        }

        bw.flush();
    }
}
