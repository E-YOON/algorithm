// 스택 수열

import java.util.Scanner;
import java.util.Stack;

public class s1874 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();

        int num = 1;    // 오름차순으로 넣을 수
        boolean result = true;

        for(int i=0; i<arr.length; i++) {
            int now = arr[i];   // 현재 수열의 수

            if(now >= num) {    // 값이 같아질 때까지 push
                while(now >= num) {
                    stack.add(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");

            } else {            // 현재 수열이 더 작으면 pop
                int top = stack.pop();

                // 가장 위에 있는 수가 수열의 수보다 크면 NO
                if(top > now) {
                    System.out.println("NO");
                    result = false;
                    break;

                } else {
                    sb.append("-\n");
                }
            }
        }

        if(result) {
            System.out.println(sb.toString());
        }

        scan.close();
    }
}
